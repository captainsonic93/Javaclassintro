package com.company;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        System.out.println("Loading");
        System.out.println(" ------------Loading");
        System.out.println("----------------------Loading");
        System.out.println("--------------------------------Loading");
        System.out.println("-------------------------------------------Loading");
        System.out.println("----------------------------------------------------Loading");
        System.out.println("----------------------------------------------------------------Loading");
        System.out.println("done");
        System.out.println("");
        System.out.println("Welcome to the Deadliest Word Game Ever");
        System.out.println("utilizing we made a game that kills");
        System.out.println("Enter secret word- don't let anyone know");
        String secretword = new Scanner(System.in).next();
        System.out.println(" the secret word just lost its letter. " +
                "The word needs help getting all of it constants and vowels");
        System.out.println("will you help? enter yes or no");
        String willHelp = new Scanner(System.in).next();
        if (willHelp.toLowerCase().equals("no")) {
            System.out.println("Really?---You Died");
        }
        if (willHelp.toLowerCase().equals("yes")) {
            System.out.println("awesome lets go!");
            int numberOfGuesses = secretword.length();
            System.out.println("you have " + numberOfGuesses + " times to figure it out or you'll die ");
            System.out.println("playing");
            int correct = 0;
            int guess = 0;
            while (guess < numberOfGuesses) {
                System.out.println("Guessing enter a letter");
                String guessedChar = new Scanner(System.in).next();
                if (secretword.contains(guessedChar)) {
                    System.out.println(" B You Guessed It ");
                    correct++;
                }
                if (correct == numberOfGuesses) {
                    System.out.println("You Win. Try with a much bigger Word Next time");
                }





            }
        }
    }
    static void restartGame(){

    }

}






