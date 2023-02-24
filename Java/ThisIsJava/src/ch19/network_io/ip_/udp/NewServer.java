package ch19.network_io.ip_.udp;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class NewServer extends Thread{

    public static void main(String[] args) {
        try {
            // DatagramSocket 생성
            DatagramSocket datagramSocket = new DatagramSocket();

            // 구독하고 싶은 뉴스 주제 정하기
            String data = "정치";
            byte[] bytes = data.getBytes("UTF-8");
            DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost", 50001));

            datagramSocket.send(sendPacket);

            while (true){
                // 뉴스 받기
                DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                datagramSocket.receive(receivePacket);

                // 문자열로 변환
                String news = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
                System.out.println(news);

                // 10번쨰 뉴스를 받으면 while 문 종료
                if (news.contains("뉴스10")) break;
            }

            datagramSocket.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }





}
