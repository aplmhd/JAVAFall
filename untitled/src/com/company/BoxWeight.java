package com.company;

public class BoxWeight extends  Box {

    int weight;


    BoxWeight(BoxWeight ob){

        super(ob);
        weight = ob.weight;


    }


    void display(){

        super.display();

        System.out.println("this is BoxWeight class");
    }


    BoxWeight(int h,int width,int d, int xx){

        super(width,h,d);
        weight = xx;



    }


/*

    BoxWeight(int h, int w, int d, int we){

        height = h;
        width = w;
        depth = d;
        weight = we;



    }
*/
}
