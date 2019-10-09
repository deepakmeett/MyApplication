package com.example.myapplication;

import java.util.Scanner;

public class SwitchRtnTyp {
    public static void main(String[] args) {
        System.out.println("Enter + or - or * or /");
        String a;
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        int b = s.nextInt();
        int c = s.nextInt();
        SwitchRtnTyp sw = new SwitchRtnTyp();

        switch (a) {

            case "+":
                int plus = sw.add(b,c);
                System.out.println(plus);
                break;

            case "-":
                int subs = sw.sub(b,c);
                System.out.println(subs);
                break;

            case "*":
                int multi = sw.mul(b,c);
                System.out.println(multi);
                break;

            case "/":
                int divd = sw.div(b,c);
                System.out.println(divd);
                break;

            default:
                System.out.println("Not available");
        }
    }

    public int add(int b, int c) {
        return b + c;
    }
    public int sub(int b, int c) {
        return b - c;
}
    public int mul(int b, int c) {
        return b * c;
    }
    public int div(int b, int c) { return b / c; }
}