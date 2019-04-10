package com.company;

public class ControlFlow {
    public static void main(String[] args) {


        String word1 = "goofy";
        String word2 = "sloan";
        int number1 = 23;
        int number2 = 23;
        WordGame2 wg = new WordGame2();

        if (word1 == word1){
            System.out.println(word2);

        }
        else if (word1 == word2){
            System.out.println("They are equal");
        }
        else {
            System.out.println(number1);
        }
        if (word1.length()== number2){
            System.out.println(number1);
        }
        if (number1 == number1) {
            number1--;
            System.out.println(number1);
            //WordGame2.playGame();
        }
        if (word1.length()== word2.length()){
            System.out.println("let play a game");
            //wg.playGame();
        }
        Operation doMath = new Operation();
        System.out.println(doMath.add(number1,4));
        System.out.println(doMath.message("Hmmm "));
        System.out.println(doMath.subtract(number1,number2));
        System.out.println(doMath.multiply(8,6));
        System.out.println(doMath.divide(9,3));

        for (int i = 0;i <number1;i++){
            System.out.println(i);
        }
        while ( number1 == number2 ){
            System.out.println("we out");
            number1++;
        }
        do{
            System.out.println("not shit");
        }while (number1==59);
    }
}
