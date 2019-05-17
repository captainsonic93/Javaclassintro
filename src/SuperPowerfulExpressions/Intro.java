package SuperPowerfulExpressions;



import java.util.Scanner;
import java.awt.Color;

public class Intro {

    //int userInput = new int[(new Scanner(System.in).nextInt())];

    public static void main(String[] args) {


        System.out.println("welcome to my APP");
        Scanner someInput = new Scanner(System.in);
        System.out.println("What is you name?");
        String userName = someInput.nextLine();
        System.out.println("It's Very Nice To Meet You " + userName);
        System.out.println("How Much Money Do You Have On You Right Now?");


        SomethingToDo(new Scanner(System.in).nextInt());

        SomethingToDo(new Scanner(System.in).nextInt()+ 4);
        SomethingToDo(new Scanner(System.in).nextInt());
        SomethingToDo(new Scanner(System.in).nextInt()+25);
        SomethingToDo(new Scanner(System.in).nextInt());
        SomethingToDo(new Scanner(System.in).nextInt()+300);
        SomethingToDo(new Scanner(System.in).nextInt()-1000);

    }
   public static void SomethingToDo(int userInput){

      // System.out.println(userInput);
        if (userInput > 0 && userInput < 45){
           System.out.println(userInput + " Is Greater Than Zero " +
                   "But Less Than Thirty");
       }
       if (userInput < 45 || userInput > 90){
           System.out.println(userInput + " Is Either Greater Than Zero " +
                   "Or Less Than Thirty");
       }
       if (userInput > 100 && userInput< 10000 ){
           System.out.println("Can I Borrow $100?");
           String answer = new Scanner(System.in).next();

           switch (answer){
               case "yes":{
                   System.out.println("Thanks Man");
               }
               break;
               case "no":{
                   System.out.println("I Stabbed You And Took All You Money. You Died!");
               }
               break;
               case "sure":{
                   System.out.println("I Wait For You To Pull Out Your Wallet. I Grab it and Run");
               }
               break;
           }
           System.out.println("How Much Money Do You Have");
       }

        //System.out.println();

    }
    public static String superPowerfulex(String name){
        return name;
    }
}
