package com.thisis;

class ThisIs1 {

    // Filed
    int day;
    int month;
    int year;


    public void setYear(int year) {
        // test.year = year; 와 같음
        this.year = year;
    }


    // Method

    public void printThis(){
        System.out.println(this);
    }

}
