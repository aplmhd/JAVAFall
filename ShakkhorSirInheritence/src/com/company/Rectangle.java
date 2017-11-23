package com.company;

public class Rectangle {

    int x=10;

    static  void showStatic(){

        System.out.println("this is super class static field");
    }
    void  showNormal(){

        System.out.println("This is super class normal field");
    }

    final  void  showFinal(){

        System.out.println("this is show final field");
    }

    int width = 10;
    int height = 20;

    int getArea(){

        return width*height;
    }



}
