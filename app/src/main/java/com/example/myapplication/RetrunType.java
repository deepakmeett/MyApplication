package com.example.myapplication;

import java.util.Scanner;

public class RetrunType {
    public static void main(String[] args) {
        System.out.println("Kindly enter numbers");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        RetrunType r = new RetrunType();
        int c=r.deepak(a,b);
        System.out.println(c);
    }
    public int deepak(int a, int b){

        return a+b;
    }
}
