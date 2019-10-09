package com.example.myapplication;

import java.util.Scanner;

public class Multimethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Multimethod m = new Multimethod();
        int a = s.nextInt();
        int b = s.nextInt();
        m.deepak(a);
        m.deep(b);
    }

    public void deepak(int a) {
        System.out.println(a + " is printed");
    }

    public void deep(int b) {

        System.out.println(b + " is printed");
    }
}
