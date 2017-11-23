package com.company;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Main {



    static void  show(President ob){

        System.out.println(ob.x);
        System.out.println(ob.y);


    }

    static void  Swap(President ob,President ob2 ){

       // ob=null;
        ob.x=1;
        ob.y=2;
        ob2.x=3;
        ob2.y=4;
        ob=ob2;

        ob =null;

        //ob=null;
        //ob.x=99999999;
        //System.out.println("swap method");
/*
        System.out.println(ob);
        System.out.println(ob2);
*/


        //President temp;
        //temp = ob;
        //ob = ob2;
        //ob2 = temp;

        //ob2 =null;


       // System.out.println(ob);
        //System.out.println(ob2);

    }

    static  void trip(Person p1, Person p2){

        Person ate11 = p1;

        Person ate12 = new Person("momin", "holulu");

        p1= ate12;

        p2.print();
        p2.name = ate12.name;
        p2.countryName = p1.countryName;
        p2.print();




    }

    public static void main(String[] args) {



        Person p1 = new Person("Mugabe","Zimbabwe'");

        Person p2 = new Person("Mama ","Lala land'");

        p1.print();

        trip(p1, p2);

        p2.univers(p1);

        p1.print();
        p2.print();

//        President p1 = new President(10,20);
  //      President p2 = new President(20,40);


/*

        System.out.println("\nbefore swap");


        System.out.println(p1);
        System.out.println(p2);




        p1.Swap(p1,p2);


        System.out.println("\nafter swap");



        System.out.println(p1);
        System.out.println(p2);


        show(p1);


*/

        //p1.show(p1);

        //p1.show(p1);
/*        System.out.println("before swap");


        System.out.println(p1);
        System.out.println(p2);


        System.out.println("\nafter swap");

        President temp;
        temp=p1; p1.x=200000;
        temp.x +=9;
        p1 = p2;

        p2 =temp;
      //  System.out.println(temp);

        System.out.println(p1);
        System.out.println(p2);

        show(p2);*/
/*
        p2.show(p1);
*/


    }
}
