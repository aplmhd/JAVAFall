package com.company;

public class ChildTwo extends ParentTwo {

      String name;

    ChildTwo(){

        System.out.println("lollllllllll");
    }

    ChildTwo(String a, String b){
        //super.name=a;
        //name =b;
    }

    void print(){


        //System.out.println(name);
       System.out.println(super.name);

       // System.out.println(this.name);
    }
}
