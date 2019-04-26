package com.company;

import java.util.Scanner;

public class CupTest {




    public static void main(String[] args) {

        Cuptwo drink = new Cuptwo();
        drink.size= 24;
        drink.color = "red";
        drink.height= 9;
        System.out.println("your cup has a lid? true or false");
        drink.lid = new Scanner(System.in).nextBoolean();
        System.out.println("your cup has a straw? true or false");
        drink.straw= new Scanner(System.in).nextBoolean();
        drink.width= 4;

        drink.fillCup();
        drink.takedrink();
        System.out.println(drink.color);

        System.out.println(drink.height);
        System.out.println(drink.width);
        System.out.println(drink.lid);
        System.out.println(drink.straw);






    }

    }
