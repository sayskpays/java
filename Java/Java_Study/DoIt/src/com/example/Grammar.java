package com.example;

public class Grammar {
    public static void main(String[] args) {

        // 삼항 연산자, 조건문, 반복문



        
          // 삼항 연산자 

        /* 
        String test = "hong";
        int a = 10;

        int num = (5/3) ? 10 : 20;
        boolean flag = (a>10) ? true : false;
        boolean flagColumn = (test=="hong") ? true : false;
        String flagColumn1 = (test.equals("hong")) ? "a" : "b";

        // 예시
        int fatherAge = 40;
        int motherAge = 50;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';
        */



        // if문
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("성적을 입력하세요,");
        int str = in.nextInt();
        
        if(str >=90){
            System.out.println("A");
        }else if(str >= 80){
            System.out.println("B");
        }else if(str >= 70){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
         */


         // if문 -> 삼항 연산자
        /*  
        int score = 80;
        String grade;

        if(score>=90){
            grade = 'A';
        }else{
            grade = 'B';
        }

        grade = (score >= 90) ? 'A' : 'B';
        */


        // if문 -> switch문

        /* 
        int rank = 1;
        char medaColor;
        String medal = "Gold";

        if(rank ==1){
            medaColor = 'G';
        }else if(rank ==2){
            medaColor ='S';
        }else{
            medaColor = 'H';
        }

        switch(rank){
            case 1 : medaColor = 'G';
            case 2 : medaColor = 'S';
            default : medaColor = 'H';
        }

        switch(rank){
            case 1: case 3: case 5: case 7: case 9: 
            medaColor = 'H';
            case 4:case 6: case 8: case 10:
            medaColor = 'J';
        }
         
        
        switch(medal){
            case "Gold":
            System.out.println("금메달 입니다.");
            break;
            case "Silver":
            System.out.println("은메달 입니다.");
            break;
            case "Bronze":
            System.out.println("동메달 입니다.");
            break;
        }
        */



        // 반복문

        /* while 문 */

        /* 
        int num = 1;
        int sum = 0;

        while(num <= 10){
            num += sum;
            num++;
        }
        System.out.println("1부터 10 까지의 합은" + sum + "입니다.");

        // while 문 -> do while 문
        int num = 1;
        int sum = 0;

        do{
            sum += num;
            num++;
        } while(num <=10);

        System.out.println("1부터 10까지의 합은" + sum + "입니다");
        */

        

        /*

        // for 문

        int i;
        int sum;

        for(i=1, sum=0; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);

        // 초기화식 생략

        int j = 0;
        for( ; j < 5 ; j++){

        }

        // 조건식 생략

        for(i=0; ; i++){
            sum += i;
            if(sum > 200) break;
        }

        // 증감식 생략

        for(i = 0; i < 5 ; ){
            i = (++i) % 10;
        }

        */


        /* continue 문 
         * 
         * 반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고, 
         * for문의 처음으로 돌아가 증감식 수행
         * 
        */

        /*
        int total = 0;
        int num;

        for(num=1; num <= 100; num++){
            if(num % 2 == 0){
                continue;
            }
            total += num;
        }

        System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다.");
         */



        /* break문 */

        /* 
        int sum = 0;
        int num = 0;

        for(num=0; ; num++){
            sum += num;
            if(sum >=100){
                break;
            }
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
        */


        // 두개의 차이점 전자는 sum이 500까지의 합을 구하는데 요소 값이 +1 되서 나옴 

        /* 
        int sum1 = 0;
        int num1;

        for(num1=1; sum1 < 500 ; num1++){
            sum1 += num1;
        }

        System.out.println(num1);
        System.out.println(sum1);
        
        
        int sum = 0;
        int num;

        for(num =1 ;  ; num ++){
            sum += num;
            if(sum >= 500){
                break;
            }
        }
        System.out.println(num);
        System.out.println(sum);
        */


        /* Class */

        // new로 클래스를 생성한다는 것은 Heap 메모리를 할당 받는 것
        // static을 사용하여 인스턴스를 생성하지 않고 메소드, 변수를 설정하면 Heap에 메모리가 등록되지 않는다.

        // Student studentName = new Student();
        // studentName은 참조변수 이 변수는 생성된 인스턴스를 가리키게 된다.
        // studentName은 지역변수, 스택 메모리에 생성된다. new Student()로 생성되는 인스턴스는 Heap 메로리에 생성된다.
        // 즉 스택 메모리에 생성된 studentName이 Heap에 저장된 인스턴스의 주소를 저장하는 것이다.

        // Heap 메모리
        // dynamic memory(동적 메모리) 일반적으로 프로그램은 스택, 힙 , 데이터 이렇게 세 영역 사용
        // 힙은 동적으로 할당 되며 , 사용이 끝나면 메모리를 해제 해줘야 한다. (gc 사용)















    }    
}
