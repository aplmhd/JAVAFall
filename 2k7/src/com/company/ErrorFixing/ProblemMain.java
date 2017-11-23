package com.company.ErrorFixing;

public class ProblemMain {


    public static void main(String[] args) {


        Student student = new Student("123");

        Person person = student;

        person.printInfo();

        System.out.println(person.name);



    }
}
