package com.company;

public class Dogs {
    public static void main(String[] args) {
        CheckDog("Fido",12,20);
        CheckDog("jean",13,51);

        // not in here
    }
    // But out Here.

    // Grabs a Dog to send throughout the Dog Calc Program
    public static void CheckDog(String dogName, int age,int weight){
        int dogAIHY = DogYearCalc(age,weight);
        System.out.println("Your dog " + dogName + " is " + dogAIHY + " Years Old");

    }

    public static int DogYearCalc(int age , int weight){
        switch(age){
            case 1 : return 15;
            case 2 : return 24;
            case 3 : return 28;
            case 4 : return 32;
            case 5 : return 36;
            default: {
                if(age > 5 && weight < 21){
                    int rate = age - 5;
                    int humanYears = 4 * rate;
                    return humanYears + 36;
	                    /*
	                    Flat Method

	                    return ((age - 5) * 4) + 36;
	                    */
                }
                else if( age > 5 && weight < 51){
                    return ((age - 5) * 6) + 36;
                }
                else if( age > 5 && weight > 50){
                    return ((age - 5) * 9) + 36;
                }
            }
        }


        return 0;
    }



}
