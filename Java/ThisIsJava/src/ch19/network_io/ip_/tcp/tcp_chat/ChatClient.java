package ch19.network_io.ip_.tcp.tcp_chat;


import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/*
 *  ChatClient 단일 클래스
 *
 * 채팅 서버로 연결을 요청하고, 연결된 후에는 제일 먼저 대화명을 보낸다.
 * 그리고 난 다음 서버와 메세지를 주고 받는다.
 *
 * */
public class ChatClient {

    // Field

    // 연결 요청과 연결 끊을때 필요
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String chatName;

    // Method

    public void connect() throws IOException {
        socket = new Socket("localhost", 50001);
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        System.out.println("[클라이언트] 서버에 연결됨");
    }

    public void receive() {
        Thread thread = new Thread(() -> {

            try {
                while (true) {
                    String json = dis.readUTF();
                    JSONObject root = new JSONObject(json);
                    String clientIp = root.getString("clientIp");
                    String chatName = root.getString("chatName");
                    String message = root.getString("message)");
                    System.out.println("<" + chatName + "@" + clientIp + ">" + message);

                }
            } catch (IOException e) {
                System.out.println("[클라이언트] 서버 연결 끊김");
                System.exit(0);
            }
        });
        thread.start();
    }

    public void send(String json) throws IOException {
        dos.writeUTF(json);
        dos.flush();
    }

    public void unconnect() throws IOException {
        socket.close();
    }

    public static void main(String[] args) {

        try {
            ChatClient chatClient = new ChatClient();
            chatClient.connect();

            Scanner scanner = new Scanner(System.in);
            System.out.println("대화명 입력:");
            chatClient.chatName = scanner.nextLine();

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("command", "incoming");
            jsonObject.put("data", chatClient.chatName);
            String json = jsonObject.toString();
            chatClient.send(json);

            chatClient.receive();

            System.out.println("=========================");
            System.out.println("보낼 메세지를 입력하고 Enter");
            System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
            System.out.println("=========================");

            while (true) {
                String message = scanner.nextLine();
                if (message.toLowerCase().equals("q")) break;
                else {
                    jsonObject = new JSONObject();
                    jsonObject.put("command", "message");
                    jsonObject.put("data", message);
                    json = jsonObject.toString();
                    chatClient.send(json);
                }
            }
            scanner.close();
            chatClient.unconnect();
        } catch (IOException e) {
            System.out.println("[클라이언트] 서버 연결 안됨");
        }
    }

}
