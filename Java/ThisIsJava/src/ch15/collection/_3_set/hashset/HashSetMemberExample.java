package ch15.collection._3_set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetMemberExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        // 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
    }
}
