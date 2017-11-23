package com.company;


public class InterFaceTester  {


    public static void main(String[] args) {

        //System.out.println();

        InterFaceShape in;

        CRectangle rec = new  CRectangle(10,20);
        CTriangle tr = new CTriangle(10,20);

        in = rec;
        in.draw();
        System.out.println(in.getArea());

    }




}
