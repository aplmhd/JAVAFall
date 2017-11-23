package com.company;

public class ColoredRectangle extends Rectangle {


    int x=90;

    private String color = "blue";

    public  int getPeriPhery(){

        return 2*width*height;
    }

    void  setColor(String color){

        this.color = color;
    }

    String getColor(){

        return color;
    }


    void showX(){

        System.out.println("X man value"+x);
    }



}
