package com.company;

public class Box {


    int x=1;
    int y=2;


    Box copy(Box ob){

        Box copy = new Box();
        copy =  ob;

        return copy;


    }

    void  display(){


        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
