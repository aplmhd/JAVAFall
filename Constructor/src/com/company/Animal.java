package com.company;

public class Animal extends ProAnimal {

    private String fName;
    private String lName;

    Animal(){

    }

    Animal(String fName, String lName){

        this.fName = fName;
        this.lName = lName;


    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
