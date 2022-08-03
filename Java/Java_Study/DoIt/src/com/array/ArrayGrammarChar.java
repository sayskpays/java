package com.array;

public class ArrayGrammarChar {

    public static void main(String[] args) {
        char[] a = new char[26];
        char ch = 'a';

        for(int i =0; i<a.length; i++, ch++){
            a[i] = ch;
            System.out.println(ch);
        }

        for(int i=0; i<a.length;i++){

            // a[i]에 담긴 char 데이터는 아스키 코드 값으로 저장. 때문에 int 형변환 가능
            System.out.println(a[i] + "," + (int)a[i]);
        }
    }
}
