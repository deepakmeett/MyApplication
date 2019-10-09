package com.example.myapplication;

import java.util.Scanner;

public class MltiMthdWthScner {
    public static void main(String[] arg) {

        int a, b;
        System.out.println("Enter 1st number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Enter 2st number");
        b = s.nextInt();

        MltiMthdWthScner d = new MltiMthdWthScner();
        d.add(a, b);
    }

    public void add(int a, int b) {
        int i = a + b;
        System.out.println("Sum of " + a + " and " + b + " is = " + i);
    }
}
