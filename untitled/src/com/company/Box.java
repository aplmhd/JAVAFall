 package com.company;

public class Box {


    int width;
    int height;
    private int depth;


    int volume(){


            return  width *height * depth;
    }

    /*Empty Constructor*/
    public Box(){


    }

    Box(Box ob){

        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }


    Box( int w, int h, int d){

        width = w;
        height = h;
        depth = d;

    }

    void display(){

        System.out.println("this is box class");
    }



    void set(Box ob){



        ob.width = 20;


    }

    void  show(){

        System.out.println("Width:"+width+"\nHeight:"+height+"\nDepth:"+depth);
        System.out.println();
    }


    public Box rt(){

        Box a = new Box();

        return a;
    }
   /* public String toString(){

    return  "length"+length+"width";
    }
*/



}
