package com.company;

import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {


        ChildTwo ob= new ChildTwo("red","redish");

        ob.print();

        //GrandChildTwo ob = new GrandChildTwo("x","y","z");



        /*

       /// Rectangle sRect = new  Rectangle();

        ColoredRectangle cRect = new ColoredRectangle();

        cRect.height=2;
        cRect.width=3;
        cRect.x=10000;
        Rectangle sRect = cRect;

        cRect = (ColoredRectangle) sRect;

        System.out.println(cRect.x);

        System.out.println(sRect.getArea());

*/


        /*

        System.out.println(sRect.getArea());

        ColoredRectangle cRect = new ColoredRectangle();

        cRect.showX();

        cRect.height=2; cRect.width=3;

        System.out.println(cRect.getArea());

        sRect = cRect;

        System.out.println(sRect.getArea());

*/
        //System.out.println(sRect.x);

    }
}
