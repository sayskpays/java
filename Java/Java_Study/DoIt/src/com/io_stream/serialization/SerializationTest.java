package com.io_stream.serialization;

/*
* 직렬화에 사용할 Person 클래스를 하나 만들어 인스턴스로 생성한 후
* 파일에 썼다가 복원하는 예제
*
* Person 클래스의 생성자로 두 인스턴스 생성
* 이를 serial.out 파일에 저장(직렬화)
*
* 그리고 나서 serial.out파일에 저장된 내용을 읽어서 원래 인스턴스 상태로 복원(역직렬화)
*
* */

import java.io.*;

class Person implements Serializable{
    private static final long serialVersionID = -154912431280L;

    String name;
    transient String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name+ "," + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person personA = new Person("에이", "대포");
        Person personB = new Person("비", "전무");

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(personA); // personA와 PersonB 값을 파일에 씀 (직렬화)
            oos.writeObject(personB);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.out");
        ObjectInputStream ois = new ObjectInputStream(fis)){
            Person p1 = (Person)ois.readObject(); // personA와 personB 값을 파일에서 읽어들임(역직렬화)
            Person p2 = (Person)ois.readObject(); // Person으로 형변환 하는 이유는 readObject 메서드 반환값이 Object 여서

            System.out.println(p1);
            System.out.println(p2);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
