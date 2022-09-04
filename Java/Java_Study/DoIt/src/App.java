import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

//        String rawString = "hi";
//        byte[] bytes = rawString.getBytes("euc-kr");
//
//        String utf8EncodedString = new String(bytes, "ksc5601");
//        System.out.println(utf8EncodedString);




        String word = "신한은행.pdf";
        System.out.println("utf-8 -> euc-kr        : " + new String(word.getBytes(StandardCharsets.UTF_8), "euc-kr"));
        System.out.println("utf-8 -> ksc5601       : " + new String(word.getBytes(StandardCharsets.UTF_8), "ksc5601"));
        System.out.println("utf-8 -> x-windows-949 : " + new String(word.getBytes(StandardCharsets.UTF_8), "x-windows-949"));
        System.out.println("utf-8 -> iso-8859-1    : " + new String(word.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1));

        System.out.println("iso-8859-1 -> euc-kr        : " + new String(word.getBytes(StandardCharsets.ISO_8859_1), "euc-kr"));
        System.out.println("iso-8859-1 -> ksc5601       : " + new String(word.getBytes(StandardCharsets.ISO_8859_1), "ksc5601"));
        System.out.println("iso-8859-1 -> x-windows-949 : " + new String(word.getBytes(StandardCharsets.ISO_8859_1), "x-windows-949"));
        System.out.println("iso-8859-1 -> utf-8         : " + new String(word.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));

        System.out.println("euc-kr -> utf-8         : " + new String(word.getBytes("euc-kr"), StandardCharsets.UTF_8));
        System.out.println("euc-kr -> ksc5601       : " + new String(word.getBytes("euc-kr"), "ksc5601"));
        System.out.println("euc-kr -> x-windows-949 : " + new String(word.getBytes("euc-kr"), "x-windows-949"));
        System.out.println("euc-kr -> iso-8859-1    : " + new String(word.getBytes("euc-kr"), StandardCharsets.ISO_8859_1));

        System.out.println("ksc5601 -> euc-kr        : " + new String(word.getBytes("ksc5601"), "euc-kr"));
        System.out.println("ksc5601 -> utf-8         : " + new String(word.getBytes("ksc5601"), StandardCharsets.UTF_8));
        System.out.println("ksc5601 -> x-windows-949 : " + new String(word.getBytes("ksc5601"), "x-windows-949"));
        System.out.println("ksc5601 -> iso-8859-1    : " + new String(word.getBytes("ksc5601"), StandardCharsets.ISO_8859_1));

        System.out.println("x-windows-949 -> euc-kr     : " + new String(word.getBytes("x-windows-949"), "euc-kr"));
        System.out.println("x-windows-949 -> utf-8      : " + new String(word.getBytes("x-windows-949"), StandardCharsets.UTF_8));
        System.out.println("x-windows-949 -> ksc5601    : " + new String(word.getBytes("x-windows-949"), "ksc5601"));
        System.out.println("x-windows-949 -> iso-8859-1 : " + new String(word.getBytes("x-windows-949"), StandardCharsets.ISO_8859_1));
//





    }



}
