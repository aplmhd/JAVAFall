package com.company;

public class Fajlami {

    Student x = new Student();




    void setX(String name, int id, float cgpa){

        x.name = name;
        x.cgpa = cgpa;
        x.id = id;
        

    }


    void show(){

        System.out.println(x.name);
        System.out.println(x.cgpa);
        System.out.println(x.id);
    }
}
