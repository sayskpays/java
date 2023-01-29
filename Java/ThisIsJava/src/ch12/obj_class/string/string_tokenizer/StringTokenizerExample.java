package ch12.obj_class.string.string_tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data, "/");

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
