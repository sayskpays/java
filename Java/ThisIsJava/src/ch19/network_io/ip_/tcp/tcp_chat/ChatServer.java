package ch19.network_io.ip_.tcp.tcp_chat;

import org.json.JSONObject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
    // Field

    // 클라이언트의 연결 요청 수락
    ServerSocket serverSocket;
    // 100개의 클라이언트가 동시에 채팅할 수 있도록 쓰레드 풀 생성
    ExecutorService threadPool = Executors.newFixedThreadPool(100);
    // 통신용 SocketClient를 관리하는 동기화된 Map 컬렉션
    Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

    // Method

    /* start 메소드는 채팅 서버가 시작할 때 제일 먼저 호출
    50001번 Port에 바인딩하는 ServerSocket을 생성
    작업 스레드가 처리할 Runnable을 람다식으로 제공
    람다식은 accept() 메소드로 연결을 수락,
    통신용 SocketClient를 반복해서 생성

     */
    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        System.out.println("[서버] 시작됨");

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    SocketClient sc = new SocketClient(this, socket);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }// start()

    // 클라이언트 연결 시 SocketClient 생성 및 추가 ( SocketClient를 chatRoom에 추가)
    public void addSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.put(key, socketClient);
        System.out.println("입장 :" + key);
        System.out.println("현재 채팅자 수:" + chatRoom.size() + "\n");
    }

    // 클라이언트 연결 종료 시 SocketClient 제거 ( SocketClient를 chatRoom에서 삭제)
    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.remove(key);
        System.out.println("나감:" + key);
        System.out.println("현재 채팅자 수" + chatRoom.size() + "\n");
    }

    public void sendToAll(SocketClient sender, String message) {
        JSONObject root = new JSONObject();
        root.put("clientIp", sender.clientIp);
        root.put("charName", sender.chatName);
        root.put("message", message);
        String json = root.toString();

        Collection<SocketClient> socketClients = chatRoom.values();
        for (SocketClient sc : socketClients) {
            if (sc == sender) continue;
            sc.send(json);
        }
    }

    public void stop() {

        try {
            serverSocket.close();
            threadPool.shutdownNow();
            chatRoom.values().stream().forEach(sc -> sc.close());
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

        try {
            ChatServer chatServer = new ChatServer();
            chatServer.start();

            System.out.println("=======================================");
            System.out.println("서버를 종료하려면 q를 입력하고 Enter");
            System.out.println("=======================================");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String key = scanner.nextLine();
                if (key.equals("q")) break;
            }
            scanner.close();
            chatServer.stop();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
