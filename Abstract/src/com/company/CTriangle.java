package com.company;

 public class CTriangle implements InterFaceShape {

    double base;
    double height;

   // @Override
    public void draw() {
        System.out.println("This is triangle draw");
    }

    //@Override
    public double getArea() {
        return base * height *.5;
    }

     public CTriangle(double base, double height) {
         this.base = base;
         this.height = height;
     }


 }
