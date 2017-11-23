package com.company;

 public class CRectangle implements InterFaceShape {

     private  double width;
     private  double height;




     void show(){
         //x=10;
         System.out.println();
         System.out.println("bangladesh");
     }
     //@Override
     public double getArea() {
         return  width *height;
     }

    // @Override
     public void draw() {
         System.out.println("I am rectangle");
     }

     public CRectangle(double width, double height) {
         this.width = width;
         this.height = height;
     }


 }
