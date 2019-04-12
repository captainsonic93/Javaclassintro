package com.company;

public class Modifiers {
    /**
     * private
     * default
     * protected
     * public

    private short e = 34;
    protected long r = 23;

    public static void main(String[] args) {
        //System.out.println(r);
    }
    private static void main(){

    }
*/
    public static void main(String[] args) {
        // calling all methods
        saySomethingNice();
        secretWord();

    }
     static void saySomethingNice(){
        String sloan = "yo";
        System.out.println(sloan);


    }
    public static void secretWord(){
        String arcade = "Hello game";
        String a = arcade.substring(4,8);
        String b = arcade.substring(7);
        String c = b + arcade + a;
        System.out.println(c);

    }


}
