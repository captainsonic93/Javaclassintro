package com.company;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Random;
import java.util.Scanner;

public class MyHouse {

    //what my object Knows
    public int walls;
    public int doors;
    public int hallways;
    public int windows;
    public boolean roof;
    public boolean floor;
    public int levels;
    public String foundation;
    public boolean secretPassage;
    public int fireplace;
    public int raccoons;
    public int deadBodies;
    private String td;

    //what my object does


    public static void main(String[] args) {

        openDoor();
        setFireplace();
        closeDoor();
    }
    public static void openDoor(){
        System.out.println("opened door");
    }
    public static void closeDoor(){
        System.out.println("closed door");
    }
    public static void setFireplace(){
        System.out.println("how many Fireplace are in " +
                "your house?");
        int fireplace = new Scanner(System.in).nextInt();
        if (fireplace < 4){
        System.out.println("you have "+fireplace+ " fireplaces");}
        else if (fireplace >= 4 && fireplace < 10){
            System.out.println("you have a lot of fireplaces");
        }
        else if (fireplace > 9){
            System.out.println("you have too many fireplaces you are going to start fire and burn down your house");
        }


    }
    public static void temss(){
        System.out.println("89");
    }
    public static void Review(){
        System.out.println("test");


    //public static void main(String[] args) {




        //setFireplace();
        //closeDoor();
    //}

}
}
