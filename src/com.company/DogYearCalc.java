package com.company;


import java.util.Scanner;

public class DogYearCalc {

    static void NewDog(){
        System.out.println("do you have another dog?");
        String userAnswer = new Scanner(System.in).next();
        switch (userAnswer){
            case "yes":{
                calc();
            }
            break;
            case "no": {
                System.out.println("");
                System.out.println("Thank You!");
                System.out.println("have a great day");
            }
        }
    }

    public static void main(String[] args) {
        calc();
    }

    public static void calc(){

        System.out.println("");
        System.out.println("what is your dogs name?");
        String name = new Scanner(System.in).next();
        System.out.println("");
        System.out.println("Dog's Age?");
        int Age = new Scanner(System.in).nextInt();
        System.out.println("");
        System.out.println("Dog's Weight?");
        int Weight = new Scanner(System.in).nextInt();
        System.out.println("");


        if (Age <= 1) {
            System.out.println(name + " is 15 in Dog Years");
        }
        if (Age == 2) {
            System.out.println(name + " is 24 in Dog Years");
        }
        if (Age == 3) {
            System.out.println(name + " is 28 in Dog Years");
        }
        if (Age == 4) {
            System.out.println(name + " is 32 in Dog Years");
        }
        if (Age == 5) {
            System.out.println(name + " is 36 in Dog Years");
        }
        if (Age > 5) {

            if (Weight < 21) {
                if (Age >= 6) {
                    System.out.println(name + " is " + (36 + 4 * (Age - 5)) + " in Dog Years");
                }
           /* if(Age == 6){
                System.out.println("Human Years is 40");
            }
            if(Age == 7){
                System.out.println("Human Years is 44");
            }
            if(Age == 8){

            }*/
            } else if (Weight > 49) {
                if (Age >= 6) {
                    System.out.println(name + " is " + (36 + 8 * (Age - 5)) + " in Dog Years");
                }
            } else if (Weight < 50) {
                if (Age >= 6) {


                    System.out.println(name + " is " + (36 + 5 * (Age - 5)) + " in Dog Years");
                }
            }
        }
            if(Weight < 21){
                System.out.println("Your Dog is a Small Breed");
            }
            else if (Weight < 50){
                System.out.println("Your Dog is a Medium Breed");
        }
            else if (Weight > 49){
                System.out.println("Your Dog is a Large Breed");
            }


        System.out.println("");
        NewDog();


}

}
    /**public static void CheckDog(String dogname, int age, int weight){
        int dogAIHY = DogYearCalc(age, weight);
    }
    public static int DogYearCalc(int age, int weight){
        return 0;

    }

}*/
