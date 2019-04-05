package com.company;

public class MyFavorite {

        private String MyName = "Sloan";
        private String favfood = "Steak";
        private String favcolor = "blue";

        public String getMyName(){
            return MyName;
        }
        public void setMyName(String MyName){
            this.MyName = MyName;

        }
        public String getfavfood(){
            return favfood;
        }
        public void setfavfood(String favfood){
            this.favfood = favfood;
        }
        public String getfavcolor(){
            return favcolor;
        }
        public void setfavcolor(String favcolor){
            this.favcolor = favcolor;
        }

        public void playfavsong(String favsong){
            System.out.println("Playing your favorite song: " + favsong);

        }


}
