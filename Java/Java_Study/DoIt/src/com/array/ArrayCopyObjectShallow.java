package com.array;

public class ArrayCopyObjectShallow {
    public static void main(String[] args) {

        // 객체 배열 복사

        ArrayObject[] test1 = new ArrayObject[3];
        ArrayObject[] test2 = new ArrayObject[3];

        test1[0] = new ArrayObject("hong",2);
        test1[1] = new ArrayObject("jun",3);
        test1[2] = new ArrayObject("soo",5);

        // 인스턴스 째로 복사가 되기 때문에 new를 통해 새로운 인스턴스를 생성하지 않아도 된다.
        //얕은 복사 , test1요소 값을 변경하면 test2도 변경 된다.
        System.arraycopy(test1,0,test2,0,3);

        for(ArrayObject a :test2){
            a.showInfo();
        }

        test1[0].setAge(100);

        for(ArrayObject a :test2){
            a.showInfo();
        }
        for(ArrayObject a :test1){
            a.showInfo();
        }


        //////////////////////////////////////////////


    }
}
