package com.company;

public class Hippo extends Animal{

    int age;

    Hippo ob;

    public Hippo() {

        super();

    }
    Hippo(String fName, String lName, int age){

        super(fName, lName);

        this.age = age;

    }


    Hippo(Hippo ob){

        super(ob.getfName(),ob.getlName());

        age = ob.age;



    }

    void  show(){

        System.out.println("age: "+age+"\nfirstname : "+getfName() + "\n lastname"+getlName());

    }




}
