package com.example.myapplication;

import java.util.Scanner;

public class Constructor {

    public Constructor() {
        int c = add();
        System.out.println(c);
    }

    public static void main(String[] args) {
        Constructor o = new Constructor();

    }

    public int add() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a + b;
        return c;

    }
}
