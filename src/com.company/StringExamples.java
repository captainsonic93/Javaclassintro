package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringExamples {
    //This will be a helpful tool for learning

    /**
     * add any other helpful info here
     * word.charAt(enter a number here); returns char at number
     * word.concat ("enter a word"); adds a word to the end
     * word.equals("enter a word");compares two strings
     * word.toUpperCase(); makes word all up caps
     * word.toLowerCase(); makes words all lowercase
     * sout = System.out.println();
     */

    public static void main(String[] args) {
        System.out.println("Enter Life or Death If You Dare");
        String example = new Scanner(System.in).next();
        System.out.println(example.charAt(example.length()/2));
        System.out.println(example.equals(example));
        System.out.println(example.concat(example));
        System.out.println(example.toLowerCase());
        System.out.println(example.toUpperCase());
        if(example.equals("Life")){
            System.out.println("THEN DIE");
        }
        if(example.equals("Death")){
            System.out.println("Go In Peace");
        }
    }
}
