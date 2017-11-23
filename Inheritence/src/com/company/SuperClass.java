package com.company;

public class SuperClass {

    int a;
    int b;
    int c;
    String name;

    public  void display(){

        System.out.println("Super Class");
    }
    public SuperClass(){

        a=b=c=-1;
        name = null;
    }



    void show(){

        System.out.println("Super duper hit");
    }

    public  SuperClass(int a, int b, int c, String name){

        this.a =a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public int getProduct(){


        return a*b*c;
    }
}
