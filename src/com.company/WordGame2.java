package com.company;

import java.util.Scanner;

public class WordGame2 {


    public static void main(String[] args) {
        System.out.println("Welcome to The Deadliest Word Game Ever");
        System.out.println("Utilizing Java We Made A Game That Kills");
        playGame();
    }
    static void restartGame(){
        System.out.println("Do you want to restart the game? y- yes or n- no");
        String userAnswer = new Scanner(System.in).next();
        switch (userAnswer){
            case "y":{
                    playGame();
             }
            break;
            case "n":{

                System.out.println("Thank You For Playing The Game");

            }

        }
    }

    static void endgame(){
        restartGame();

    }

    static void playGame() {
        System.out.println("Enter Secret Word - Dont let anyone Know");
        String secretWord2 = new Scanner(System.in).next();
        System.out.println("The Secret Word just lost its letters " +
                "The word needs help getting all of its constants and vowels");
        System.out.println("Will you help ? enter yes or no ");
        String willHelp = new Scanner(System.in).next();

        String secretWord = ("god");
        /**switch (secretWord2.length()){
            case 1:{
                secretWord = "pie";
            }
            case 2:{
                secretWord = "hello";
            }
        }
         */
        char firstletter = secretWord.charAt(0);

        String word = ("");

        if (willHelp.toLowerCase().equals("no")) {
            System.out.println("Really?---You Died");

            System.out.println("Game Over");
            restartGame();


        }
        if (willHelp.toLowerCase().equals("yes")) {
            System.out.println("Awesome Lets Go!");
            System.out.println("The Secret Word Has " + secretWord.length()+ " Letters");
        System.out.println("Playing");
        Integer numberOfGuesses = secretWord.length()+ secretWord2.length() ;
        System.out.println("you have : " + numberOfGuesses +  " guesses");
        int correct = 0;
        int guess = 0;
        while (guess < numberOfGuesses) {
            System.out.println("Guessing enter a letter");
            System.out.println("You have guessed : " + correct +  " correct");
            System.out.println("You have "  + (numberOfGuesses - guess) + " left");
            String guessedChar = new Scanner(System.in).next();
            guessedChar.toLowerCase();


            if (secretWord.contains(guessedChar)) {
                System.out.println(" B You Guessed It ");
                correct++;

                if(secretWord.contains(guessedChar)){
                 word =   word + guessedChar;
                }

                System.out.println(word);

            } else {
                System.out.println("Haha did you think it would be that easy!");
            }
            /*if (secretWord.contains(guessedChar)!= guessedChar){
            System.out.println("Haha did you think it would be that easy!");
            }
*/

            if( correct < 1 && guess >= 1){
                System.out.println("Here is a hint " + firstletter);
            }
            guess++;

            //if(guess > 4=correct < 1){
              //  System.out.println();
            //}

            while (correct == secretWord.length()){
                System.out.println("Fuck");
                System.out.println("Congrats you have beaten me this time");
                System.out.println("You Win. Try with a much bigger Word Next Time");
                correct++;

                endgame();
                /*if (correct==secretWord.length()){
                    correct = correct + 1;
                }

*/
                if (correct > secretWord.length()){
                    numberOfGuesses = numberOfGuesses - numberOfGuesses;
                }
            }

        }
       /** if (correct >= secretWord.length())
                System.out.println("Congrats you have beaten me this time");
            restartGame();

        System.out.println("You have guessed : " + correct);
        if (correct == 6){
            System.out.println("yay!");
        }
        if (correct == secretWord.length()) {
                System.out.println("Congrats you have beaten me this time");
                restartGame();
            }
        if (correct == numberOfGuesses) {
            System.out.println("You Win. Try with a much bigger Word Next Time");
            restartGame();
        }
        if (correct < numberOfGuesses){
            System.out.println("You Have Died. Better Luck Next Time!");
            restartGame();

        }
        }
        */
        if (willHelp.toLowerCase().equals("no")) {
            System.out.println("Really?---You Died");

            System.out.println("Game Over");
            restartGame();


        }


            if (correct < numberOfGuesses){
                System.out.println("You Have Died. Better Luck Next Time!");
                restartGame();


    }
    /**static void playGame(String secretWord) {
        System.out.println("Enter Secret Word - Dont let anyone Know");
        String secretWord2 = new Scanner(System.in).next();
        System.out.println("The Secret Word just lost its letters " +
                "The word needs help getting all of its constants and vowels");
        System.out.println("Will you help ? enter yes or no ");
        String willHelp = new Scanner(System.in).next();
        secretWord = ("aprilfools");

        System.out.println("playing");
        Integer numberOfGuesses = secretWord.length() + secretWord2.length();
        System.out.println("you have : " + numberOfGuesses + " guesses");
        int correct = 0;
        int guess = 0;
        while (guess < numberOfGuesses) {
            System.out.println("Guessing enter a letter");
            String guessedChar = new Scanner(System.in).next();
            if (secretWord.contains(guessedChar)) {
                System.out.println(" B You Guessed It ");
                correct++;
            }

            guess++;
        }
        System.out.println("You have guessed : " + correct);
        if (correct == numberOfGuesses) {
            System.out.println("You Win. Try with a much bigger Word Next time");
        }
        if (willHelp.toLowerCase().equals("no")) {
            System.out.println("Really?---You Died");

            System.out.println("Game Over");
            restartGame();


       */

}
    }
}