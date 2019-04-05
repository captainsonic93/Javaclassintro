package com.company;

public class Operation {



        //this is the operation class
        // used to preform various
        //operations

        public int add (int a,int b) {
            return a + b;

        }
        public int subtract (int a,int b) {
            return a - b;
        }
        public double multiply (int a,int b) {
            return a * b;
        }
        public int divide (int a,int b) {
            return a / b;
        }
        public int increment(int a){
            return a++;
        }
        public int decrement(int a){ return a--;}
        public int modulous(int a,int b){
            return a%b;
        }
        public int multiadd(int a,int b,int c){
            return a+b+c;
        }
        public String message(String a){
            String mesg = "what ever you want to say to the person using your class";
                    return a + mesg;
        }

        //
    }

