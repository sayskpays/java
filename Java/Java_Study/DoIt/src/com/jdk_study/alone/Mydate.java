package com.jdk_study.alone;

public class Mydate {
    int day;
    int month;
    int year;

    public Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Mydate){
            Mydate test = (Mydate)obj;
            if(this.day==test.day && this.month==test.month && this.year== test.year){
                return true;
            }
        }

        return false;
    }


}
