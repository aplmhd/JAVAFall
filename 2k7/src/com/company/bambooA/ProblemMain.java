package com.company.bambooA;
import com.company.bambooB.Student;
import com.company.bambooC.Person;

public class ProblemMain {

    public static void main(String[] args) {


        Student student = new Student("161036");
        Person person = student;

        Clubmember clubmember = new Clubmember();

        person.printInfo();

        System.out.println(person.name);


    }
}
