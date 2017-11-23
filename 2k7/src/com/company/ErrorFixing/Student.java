package com.company.ErrorFixing;

public class Student extends  Person {

    public String id;

    public Student(String id) {
        this.id = id;
    }

    Student(){}

    public void printInfo() {

        System.out.println(id);
        System.out.println(name);
    }
}
