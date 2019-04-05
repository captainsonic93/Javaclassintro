package com.company;

public class KnowingMyVariables2 {

    public static void main(String[] args) {

        // call all of our methods out here

        KnowingMyVariables2test();

    }
        // write all of our methods out here
        public static void KnowingMyVariables2test(){
            MyFavorite Sloan = new MyFavorite();

            Sloan.setMyName("Sloan Thomas");
            Sloan.setfavcolor("pizza");
            Sloan.setfavfood("yellow");

            System.out.println(Sloan.getfavcolor());
            System.out.println(Sloan.getfavfood());
            System.out.println(Sloan.getMyName());

            Sloan.playfavsong("Uptown Funk - Bruno Mars");
            int i = 0;
            while (i<=10){
                System.out.println(i);
                i++;
            }
            ;
        }

    }

