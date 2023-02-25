package ch19.network_io.ip_.tcp.client_server_data_io.concurrency;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer extends Thread {

    private static DatagramSocket datagramSocket = null;
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter키를 입력하세요");
        System.out.println("-------------------------------------");


        // UDP 서버 시작
        startServer();

        // 키보드 입력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }
        scanner.close();

        // UDP 서버 종료
        stopServer();
    }

    public static void startServer() {
        // 작업 스레드 정의
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    //DatagramSocket 생성 및 Port 바인딩
                    datagramSocket = new DatagramSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while (true) {
                        // 클라이언트가 구독하고 싶은 뉴스 종류 얻기
                        DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                        datagramSocket.receive(receivePacket);

                        // 작업 큐에 처리 작업 넣기, Runnable은 함수형 인터페이스로 람다식 표현 가능
                        executorService.execute(() -> {
                            try {
                                String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);

                                // 클라이언트의 IP와 Port 얻기
                                SocketAddress socketAddress = receivePacket.getSocketAddress();

                                // 10개의 뉴스를 클라이언트로 전송
                                for (int i = 1; i <= 10; i++) {
                                    String data = newsKind + ": 뉴스" + i;
                                    byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
                                    DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
                                    datagramSocket.send(sendPacket);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        });// execute lambda
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }; // thread
        // 스레드 시작
        thread.start();
    }

    public static void stopServer(){
        // DatagramSocket을 닫고 Port 언바인딩
        datagramSocket.close();
        executorService.shutdownNow(); // 스레드 풀 종료
        System.out.println("[서버] 종료");
    }

}
