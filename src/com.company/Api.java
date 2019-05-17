package com.company;


import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Api {

    public static void main(String[] args) {
        Random random = new Random();

        IntStream ints = random.ints(10,1,100);

        ints.forEachOrdered(System.out::println);

        ArrayList<String> myList = new ArrayList<>();

        String a = new String("taco");
        myList.add(a);

        String b = new String("face");
        myList.add(b);






    }


}
