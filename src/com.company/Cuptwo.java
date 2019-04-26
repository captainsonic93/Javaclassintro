package com.company;

import java.util.Scanner;

public class Cuptwo {
    public static int size;
    public static String color;
    public static int height;
    public static boolean lid;
    public static boolean straw;
    public static boolean filled;
    public static int amountfilled;
    public static int weight;
    public static int width;
    public static int drink;

    public static void fillCup(){
        System.out.println("How filled are you wanting in oz?");
        amountfilled = new Scanner(System.in).nextInt();
        System.out.println("Cup is filled " + amountfilled + " in oz");
        if (amountfilled > size){
            System.out.println(" The cup is overflowing");
            System.out.println("get a napkin");
            endgame();

        }
    }
    public static void takedrink(){
        System.out.println("How much do you drink");
        drink = new Scanner(System.in).nextInt();
        amountfilled = amountfilled - drink;
        System.out.println("Cup is filled " + amountfilled + " in oz");


    }
    public static void endgame(){
        System.out.println("you lose");

    }
}


