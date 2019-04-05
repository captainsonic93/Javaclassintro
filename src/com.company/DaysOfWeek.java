package com.company;

import java.util.Scanner;

public class DaysOfWeek {
    /**
     * using the string class and the switch statement i will
     * create a days of the week converter
     * from the numbered day to actual day of the week
     */
    public static void main(String[] args) {
        dayofweekconverter();
    }

    static void dayofweekconverter() {
        System.out.println("enter a number 1-7");
        System.out.println("I'll tell you the week day");
        int weekday = new Scanner(System.in).nextInt();
        WordGame2 wg = new WordGame2();
        switch (weekday) {
            case 1: {
                String m = "monday";
                System.out.println(m);
            }
            break;
            case 2: {
                String t = "tuesday";
                System.out.println(t);
            }
            break;
            case 3: {
                String w = "wednesday";
                System.out.println(w);
            }
            break;
            case 4: {
                String th = "thursday";
                System.out.println(th);
            }
            break;
            case 5: {
                String f = "friday";
                System.out.println(f);
            }
            break;
            case 6: {
                String s = "saturday";
                System.out.println(s);
                System.out.println("do you want to play a game?");

                wg.playGame();
            }
            break;
            case 7: {
                String sun = "sunday";
                System.out.println(sun);
            }
            break;
        }
    }
}
