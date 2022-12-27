package ch06;

public class ConstructorExample {
    // Field
    String model;
    String color;
    int maxSpeed;

    /*

    // Constructor (중복된 생성자 코드)

    ConstructorExample(String model){
        this.model = model;
        this.color = "은색";
        this.maxSpeed = 250;
    }

    ConstructorExample(String model, String color){
        this.model = model;
        this.color = color;
        this.maxSpeed = 250;
    }

    ConstructorExample(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    */

    // Constructor (공통 코드 분리)

    ConstructorExample(String model){
        this(model, "은색", 250);
    }
    ConstructorExample(String model, String color){
        this(model, color, 250);
    }
    ConstructorExample(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    }
