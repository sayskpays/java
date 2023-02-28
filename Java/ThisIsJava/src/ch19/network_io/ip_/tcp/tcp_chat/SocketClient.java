package ch19.network_io.ip_.tcp.tcp_chat;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

// SocketClient는 클라이언트와 1:1로 통신하는 역할
public class SocketClient {
    // Field

    // chatServer 필드는 ChatServer() 의 메소드를 호출하기 위해 필요
    ChatServer chatServer;
    // socket 필드는 연결을 끊을 때 필요
    Socket socket;
    // 문자열을 읽고 보내기 위한 보조 스트림
    DataInputStream dis;
    DataOutputStream dos;
    String clientIp;
    String chatName;


    // Method
    public SocketClient(ChatServer chatServer, Socket socket) {
        try {
            this.chatServer = chatServer;
            this.socket = socket;
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = isa.getHostName();
            receive();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void receive() {
        chatServer.threadPool.execute(() -> {

            try {
                while (true) {
                    String receiveJson = dis.readUTF();

                    // JSONObject 파싱
                    JSONObject jsonObject = new JSONObject(receiveJson);
                    String command = jsonObject.getString("command");

                    switch (command) {
                        case "incoming":
                            this.chatName = jsonObject.getString("data");
                            chatServer.sendToAll(this, "들어오셨습니다");
                            chatServer.addSocketClient(this);
                            break;
                        case "message":
                            String message = jsonObject.getString("data");
                            chatServer.sendToAll(this, message);
                            break;
                    }
                }
            } catch (IOException e) {
                chatServer.sendToAll(this, "나가셨습니다");
                chatServer.removeSocketClient(this);
            }

        });
    }

    // 메소드 : JSON 보내기
    public void send(String json) {

        try {
            dos.writeUTF(json);
            dos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 메소드 : 연결 종료
    public void close() {
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
