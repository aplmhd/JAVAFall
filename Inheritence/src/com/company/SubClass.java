package com.company;

public class SubClass extends SuperClass {


    int e,x;
    public  SubClass(){

        super();


    }

    public SubClass(int e) {
        this.e = e;
    }

    public SubClass(int a, int b, int c, String name, int e) {
//        super(a, b, c, name);
        this(1);
        super.a = a;
        super.b = b;
        super.c = c;
        super.name = name;

        this.e = e;
    }

    @Override
    void show(){

        System.out.println("orrin");
    }

    public int getProduct(){


        return a*b*c*9999;
    }

    public  void display(){

        super.display();

        System.out.println("Sub Class");
    }
}
