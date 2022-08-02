package com.example;
/*
1.
 * domain.student.view.StudentView
 * domain.server.hong.StudentView
 * 
 * 같은 이름의 클래스여도 다른 패키지에 속해 있으면 서로 연관이 없다. (서로 다른 클래스)
 *

 2. void 메소드일때 해당 메소드를 종료하고 싶으면
 return; 을 써준다. (4번 메소드 참고)
 * 
*/

public class Oop {

    //Field (Member Variable)
    int studentID;
    String studentName;

    //Constructor
    public Oop(int studentID, String studentName) {
        this.studentID = studentID;

        this.studentName = studentName;
    }

    // 1번 메소드
    //Method
    public void showStudentInfo(){
        System.out.println(studentName + "," + studentID);
    }

    // 2번 메소드
    int add(int num1 , int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    // 3번 메소드
    int getTotal(){
        int i;
        int total = 0;
        for (i=0; i<=10; i++){
            total += i;
        }
        return total;
    }

    // 4번 메소드
    public void divide(int num1 , int num2){
        if(num2 == 0){
            System.out.println("나누는 수는 0이 될 수 없습니다.");

            return;
        }else{
            int result = num1 / num2 ;
            System.out.println(num1 + "/" + num2 + "=" + result);
        }
    }

}// Class
