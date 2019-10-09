package com.example.myapplication.Other;

import java.util.Scanner;

public class Cnstrc {

    public static void main(String[] args) {
        add s = new add(5, 4);

    }

    public static class add {
        public add(int a, int b) {
            System.out.println(a + b);
        }
    }
}
