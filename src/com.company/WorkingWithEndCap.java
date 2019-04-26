package com.company;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WorkingWithEndCap {

    public static void main(String[] args) throws Exception{


        Encapsulation dove = new Encapsulation();

        dove.setMyName(new Scanner(System.in).next());
        dove.setMyAge(new Scanner(System.in).nextInt());


        System.out.println(dove.getMyName().length());
        System.out.println(dove.getMyName().toUpperCase());
        System.out.println(dove.getMyName().getBytes());
        System.out.println(dove.getMyName());
        System.out.println(dove.getMyAge());
        System.out.println();

         printWithMyDelay("My name is Sloan. How are you?",TimeUnit.MILLISECONDS,100);
         printWithMyDelay("hi2003",TimeUnit.SECONDS,30);

    }
    public static void printWithMyDelay(@org.jetbrains.annotations.NotNull @NotNull String data,
                                        TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch:data.toCharArray()){
            System.out.println(ch);
            unit.sleep(delay);
        }
    }
}
