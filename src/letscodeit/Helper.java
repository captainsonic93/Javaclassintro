package letscodeit;

public class Helper {

   // DataMember sleep = new DataMember();
    //Method1 time = new Method1();
    //Method2 late = new Method2();
    //Method1 right = new Method1();



    public static void work(){


        DataMember sleep = new DataMember();
        Method1 time = new Method1();
        Method2 late = new Method2();
        Method1 right = new Method1();
        sleep.rest= "god";


        System.out.println(sleep.rest);
        time.run();
        late.laydown();
        right.run();
        boat();


    }
    public void dog(){
        DataMember sleep = new DataMember();
        Method1 time = new Method1();
        Method2 onTime = new Method2();
        Method1 left = new Method1();
        sleep.rest = "final";

        System.out.println(sleep.rest);
        System.out.println(time);
        System.out.println(left);
        System.out.println(onTime);

    }
    public static void boat(){
        System.out.println("46");
    }
}
