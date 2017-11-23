package com.company.bambooB;
import com.company.bambooC.*;


public class Student extends  Person {

    public String id;

   public Student(){

    }
    public Student(String id) {
        this.id = id;
    }

    public void printinfo(){

        System.out.println(id);
        System.out.println(name);
    }
}
