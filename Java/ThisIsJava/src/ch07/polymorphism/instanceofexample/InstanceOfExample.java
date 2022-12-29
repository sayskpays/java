package ch07.polymorphism.instanceofexample;


public class InstanceOfExample {

    public static void personInfo(Person person){
        System.out.println(person.name);
        person.walk();

        // 자식 객체의 메서드와 필드를 쓰기 위해서 강제 타입 변환
        if(person instanceof Student){
            Student student = (Student) person;
            System.out.println(student.studentName);
            student.running();
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person();

    }



}
