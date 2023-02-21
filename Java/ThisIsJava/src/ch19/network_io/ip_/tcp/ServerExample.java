package ch19.network_io.ip_.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("q or Q -> Enter closed program");
        System.out.println("------------------");

        // TCP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true){
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")){
                break;
            }
        }

    }

    public static void startServer(){
        //작업 스레드 정의
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[Server] start");

                    while (true){
                        System.out.println("[server] 연결 요청 기다림");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트의 정보 얻기
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버]" + isa.getHostName() + "의 연결요청을 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버]"+ isa.getHostName()+"의 연결을 끊음");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread.start();
    }

    public static void stopServer(){

        try {
            serverSocket.close();
            System.out.println("서버 종료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
