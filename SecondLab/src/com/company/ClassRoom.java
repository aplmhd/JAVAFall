package com.company;

public class ClassRoom {

    Student student[];

    int numberOfStudent;


    public ClassRoom(int numberOfStudent, String className){
        this.numberOfStudent = numberOfStudent;

        student = new Student[numberOfStudent];

        for(int i=0; i<numberOfStudent; i++){

            student[i] = new Student();

        }




    }
}
