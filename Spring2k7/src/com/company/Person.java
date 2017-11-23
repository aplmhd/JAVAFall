package com.company;

public class Person {

    public  String name;
    public String countryName;

    public  Person uniF;

    Person(String name, String countryName){

        this.name = name;
        this.countryName = countryName;

    }

    public void print(){

        System.out.println(name+" "+countryName);
    }

    public void univers(Person ob){

         uniF = ob;

         uniF.countryName = "uganda";


    }


}
