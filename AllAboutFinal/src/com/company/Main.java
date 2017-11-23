package com.company;

import java.util.SortedMap;

public class Main {

      static  int w;

    final   int x=10;
    final int arr2[] = new int[5];

    int y;

    Main(int x){
        this.y=x;

    }
    void  setY(int y){
        this.y = y;

    }
    Main(){}

    final int   method(int x, int z){

        final int a = x;
        final  int b =z;

        return  a+b;
        //System.out.println(a +" " +b);

       // System.out.println(a,b);

    }

    public static void main(String[] args) {

        System.out.println(AnotherMain.main(args));

        Main ob = new Main();
       final Main ob2 = new Main(10);

       ob2.w=10;

        System.out.println("static"+w);

       ob = ob2;

       ob2.setY(10);



        System.out.println(ob.method(1,2));
        System.out.println(ob.method(2,3));


/*

        ob.arr2[0] = 1;
        ob.arr2[0] =100;
        System.out.println(ob.arr2[0]);
        //ob.x=100;

       // x=10;

        System.out.println("bangladesh");
        int x;

        int arr[] = new int[5];
       int arr3[] = new  int[5];

       arr = arr3;

        System.out.println(arr +" "+ arr3);

       arr[0] = 1;
       arr[2] = 2;
       arr[3] = 3;
       arr[0] =111;
       System.out.println(arr3[0]);
*/

    }
}
