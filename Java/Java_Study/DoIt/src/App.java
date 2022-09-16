
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class App {

    public static void returnText(int a, int b){

        if(a > b){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }


    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);


        int a = scan.nextInt();
        int b = Integer.parseInt(scan.next());


        returnText(a,b);

    }

}
