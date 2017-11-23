package com.company;


public class Main {

    public static void main(String[] args) {


        //est pk = new Test();


        Box objectPass = new Box(1,2,3);




        //objectPass.show();



        Box obj1 = new Box(20,30,40);

        BoxWeight obj2 = new BoxWeight(10,20,30,40);

        obj2.display();



        System.out.println(obj1.volume());

        obj1 = obj2;

        obj1.width=100000;

        System.out.println("after modification:"+obj2.volume());

        System.out.println(obj1.volume());


    }
}
