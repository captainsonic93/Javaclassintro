package com.company;

import java.util.Scanner;

public class Day12Review {

    //access Modifiers
    private double a;
    protected String de = "words";
    int fs = 32;
    public short t = 40;

    //object
    public static void main(String[] args) {


    MyHouse house1 = new MyHouse();
        house1.deadBodies = 8;
        System.out.println(house1.deadBodies + 3);
        System.out.println("Do you have a roof? true or false");

    house1.roof = new Scanner(System.in).nextBoolean();




        house1.setFireplace();
        house1.foundation = "wood";
        System.out.println("how many dead bodies do you have in your house?");
        house1.deadBodies = new Scanner(System.in).nextInt();
        {if (house1.deadBodies< 1){
            System.out.println("you need more dead bodies");

        }
        if (house1.deadBodies>= 1 && house1.deadBodies<=15){
            System.out.println("you have a good amount of dead bodies in your house."+house1.deadBodies+":Dead Bodies");
        }
        if ( house1.deadBodies>= 16){
            System.out.println("Are you a serial killer? I'm calling the police");

        }
        }
        if (house1.roof == true ){
            System.out.println("you have a house");
        }
        else if (house1.roof == false){
            System.out.println("you have a hut");
        }
        }
    //Methods
}
