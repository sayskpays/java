package com.array;

public class ArrayObjectTest {

    public static void main(String[] args) {

        // 이렇게 될 경우 배열로 인스턴스가 아직 생성되지 않음.
        ArrayObject[] test = new ArrayObject[5];

        // 인스턴스 주소가 null로 찍힘 인스턴스 생성이 제대로 되지 않음
        for(int i=0; i<test.length; i++){
            System.out.println("디폴트 생성자로 단순 배열에 객체를 담은 경우 : "+test[i]);

            // 배열 저장소에 인스턴스를 직접 넣어줘야 한다.
            test[i] = new ArrayObject("hong"+ String.valueOf(i), i);

            System.out.println(test[i]);
            // 이렇게 배열 형식으로 메소드를 출력할 수 있다.
            test[i].showInfo();

        }




    }
}
