package com.example.myapplication;

public class CnstrcrCls {


    public static void main(String[] args) {
        CnstrcrCls1 cn= new CnstrcrCls1(2);

    }
    public static class CnstrcrCls1 {

        public CnstrcrCls1(int a){
            System.out.println(a);

        }
    }

}