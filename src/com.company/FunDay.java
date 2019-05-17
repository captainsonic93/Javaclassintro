package com.company;

import java.util.Scanner;

public class FunDay {

    private int day = new Scanner(System.in).nextInt();
    private String myName;
    public String gimli;


    public String getMyName() {
        return myName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getDay() {
        return day;
    }

    public String getGimli() {
        return gimli;
    }

    public void setGimli(String gimli) {
        this.gimli = gimli;
    }
}
