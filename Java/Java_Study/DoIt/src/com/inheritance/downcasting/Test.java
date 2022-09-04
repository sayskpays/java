package com.inheritance.downcasting;

class Engineer extends Test{
    private String skill;

    public Engineer(){


    }

    public String getSkilSet(){
        return skill;
    }
}



public class Test {
    public String name;
    public String grade;

    public Test(String name) {
        this.name = name;
    }
    public Test(){

    }
}



