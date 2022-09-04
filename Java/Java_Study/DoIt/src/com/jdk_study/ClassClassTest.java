package com.jdk_study;

import com.example.Constructor;

public class ClassClassTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Book book = new Book();
        Class bClass1 = book.getClass();
        System.out.println(bClass1);


        Class bClass2 = Book.class;
        System.out.println(bClass2.getName());

        Class bClass3 = Class.forName("com.jdk_study.Book"); // 파라미터로 받은 클래스가 존재하지 않으면 ClassNotFoundException 발생
        System.out.println(bClass3.getName());

        //인스턴스 생성 방법
        Book bClass4 = (Book)bClass3.newInstance(); // -> default 생성자로 인스턴스 생성, newInstance()의 반환값이 Object 이므로 다운 캐스팅


        /*  사용 예시)
        *   프로그램 실행 이후 클래스의 로딩이 필요한 경우, 클래스의 동적 로딩 방식 사용
        *   여러 데이터베이스 드라이버 중 필요한 드라이버의 값을 설정 파일에서 읽어 문자열 변수로 저장,
        *   이후 간단하게 로딩
        * */

        String dbName = "com.db.Oracle";
        Class dbClass = Class.forName(dbName);







    }
}
