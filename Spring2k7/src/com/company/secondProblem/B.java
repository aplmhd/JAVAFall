package com.company.secondProblem;

public class B extends A {

    String name;

    B(String name1, String name2){


        this.name = name1;

        super.name= name2;
    }

    public void printName() {
       // System.out.println(name);
       System.out.println(super.name);
    }
}
