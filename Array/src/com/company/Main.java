package com.company;

import java.security.SecureRandom;

public class Main {

    static void modify(int[] x){

        for(int i =0; i<x.length; i++){

            x[i]=i;
        }


    }

    static void modify(int x){

        x=10000;


    }


    public static void main(String[] args) {


        int[] temp = new int[24];

        modify(temp);

        modify(temp[23]);

        for (int x:temp)
            System.out.println(x);


    }
}
