package com.company.secondProblem;

public class OutputSolution  {

    public static void main(String[] args) {


        A a = new A();

        B  b = new B("ANik", "AHmed");

        a.name = "safat";
        a.printName();
        a = b;
        System.out.println(a.name);
        a.name = "tawhid";

        a.printName();

    }
}
