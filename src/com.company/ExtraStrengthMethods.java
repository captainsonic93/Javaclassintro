package com.company;

public class ExtraStrengthMethods {

    // all extra strength methods, well  not really all of them

    /**write a method that takes no input
     * you can name this method what ever you like
     * do not worry about what the method does
     * only focus on what the method outputs
     *
     */
static void dead(String fname) {
    System.out.println("I killed " + fname);
}
public static void god(){
    System.out.println("all were saved");
}

    public static void main(String[] args) {
        dead("Jim");
        dead("Sam");
        dead("Kelly");
        god();
        face(4,3);
        add(56,32);
    }
    public static void face(int a, int b){
        System.out.println("Hi I'm Saint Peter " );
        String message1 = "we are adding";
        System.out.println(a+b);

    }
    public static int add(int c,int d){
    return c + d;
    }
}
