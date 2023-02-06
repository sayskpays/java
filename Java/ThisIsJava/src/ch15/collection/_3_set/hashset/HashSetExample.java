package ch15.collection._3_set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); // 중복 객체이므로 저장 X
        set.add("Spring");
    }
}
