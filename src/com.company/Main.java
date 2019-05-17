package com.company;

public class Main {
    public static void main(String[] args) {
        Base D = new Derived();
        D.show();
        doNothing(2,3);


    }

    public static void doNothing(double a, double b){
        System.out.println(a+b/(a*b)-2*a);
    }
}
