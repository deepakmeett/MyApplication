package com.example.myapplication;

public class Overloding {
    public static void main(String[] args) {

        Overloding o = new Overloding();
        o.deepak(10,20);
        o.deepak();
        o.deepak(18);
    }


    public void deepak(int a, int b){
        System.out.println(a+"   "+b);
    }
    public void deepak(){
        System.out.println("Deepak");
    }

    public void deepak(int a){
        System.out.println(a);

    }


}
