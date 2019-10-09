package com.example.myapplication;

import java.util.Scanner;

public class SwitchMM {
    public static void main(String[] args) {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter + or - or * or / ");
        a=s.nextLine();
        int b=s.nextInt();
        int c = s.nextInt();
        SwitchMM sw = new SwitchMM();
        switch (a){
            case "+":
                sw.add(b,c);
                break;

            case "-":

                sw.sub(b,c);
                break;

            case "*":

                sw.mul(b,c);
                break;

            case "/":

                sw.div(b,c);
                break;

                default:
                    System.out.println("Not available");
        }
    }
    public void add(int b, int c){

        System.out.println(b+c);
    }

    public void sub(int b, int c){

        System.out.println(b - c);
    }
    public void mul(int b, int c){

        System.out.println(b*c);
    }
    public void div(int b, int c){

        System.out.println(b/c);
    }
}