package com.example.myapplication;

public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.re(2);
    }

    public void re(int a) {

        if (a <= 21) {
            System.out.print(a+" ");
            a = a+2;
            re(a);
        }
    }
}
