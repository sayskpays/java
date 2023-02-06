package ch15.collection._3_set.hashset;

import java.util.Objects;

public class Member {

    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            // name과 age값이 같으면 동일한 true 가 리턴됨
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        // name과 age값이 같으면 동일한 hashCode가 리턴됨
        return name.hashCode() + age;
    }

}
