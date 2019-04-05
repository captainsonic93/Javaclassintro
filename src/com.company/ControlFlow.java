package com.company;

public class ControlFlow {
    public static void main(String[] args) {


        String word1 = "goofy";
        String word2 = "sloan";
        int number1 = 23;
        int number2 = 5;
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
            WordGame2.playGame();
        }
        if (word1.length()== word2.length()){
            System.out.println("let play a game");
            wg.playGame();
        }

    }
}
