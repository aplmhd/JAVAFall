package com.company;

public class Student {

    String name;
    int id;
    float cgpa;

    private int pr;

    void print(){


        System.out.println("Name: "+name);
        System.out.println("CGPA: "+cgpa);
        System.out.println("ID: "+id);

    }

    void set(String name,int id, float cgpa){

        this.name = name;
        this.cgpa = cgpa;
        this.id =id;


    }

}
