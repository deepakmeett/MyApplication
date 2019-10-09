package com.example.myapplication;

import java.util.Scanner;

public class Patten {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 1;
        while (r <= n) {
            int c = 1;
            while (c <= n) {
                System.out.print("*");
                c++;
            }
            System.out.println();
            r++;
        }
    }
}
