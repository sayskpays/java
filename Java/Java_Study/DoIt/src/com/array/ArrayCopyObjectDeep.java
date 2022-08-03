package com.array;

// 깊은 복사
public class ArrayCopyObjectDeep {
    public static void main(String[] args) {
        ArrayObject[] test1 = new ArrayObject[2];
        ArrayObject[] test2 = new ArrayObject[2];

        test1[0] = new ArrayObject("hong",2);
        test1[1] = new ArrayObject("jun",3);

        // test2 새로운 인스턴스 생성
        for(int i=0; i< test1.length; i++){
            test2[i] = new ArrayObject();
        }

        // test2에는 test1과는 다른 인스턴스 주소를 가진 객체가 생성되고
        // test1의 값만 넣어주는 코드
        for(int i=0; i< test1.length; i++){
            test2[i].setAge(test1[i].getAge());
            test2[i].setName(test1[i].getName());
        }

        // * Index를 사용해야 하는 상황이니 향상된 for문 보다는 일반 for문을 사용하는 것이 낫다.

        for(int i=0 ; i<test1.length; i++){
            if(test1[i] != test2[i]){
                test2[i].showInfo();
            }else{
                System.out.println("Same Object");
            }
        }

    }
}
