package com.example.myapplication;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int a;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter no");
        a = s.nextInt();

        switch (a){
            case 1:
                System.out.println("1 is Available");
                break;

            case 2:
                System.out.println("2 is Available");
                break;

                default:
                    System.out.println("Not Available");
        }
    }
}