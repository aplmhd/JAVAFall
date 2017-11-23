package com.company;

import javax.swing.*;
import  javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.StringTokenizer;

public class Main {



    static int trouble(int x){

        return x;
    }

  static   int trouble(double x){


        return 0;
    }

    public static void main(String[] args) {


      StringTokenizer name = new StringTokenizer("amr sonar bangla");

      String name2 = "orko    akt harami.. my Code is skc";

      while (name.hasMoreTokens()) {


          System.out.println(name.nextToken());
      }

          String namearr[] = "apel.akta harami".split(" ");

        System.out.println(namearr.length);

          for(String i:namearr){

              System.out.println(i);
          }



/*

      String getname = JOptionPane.showInputDialog("hello");

      String modifi = String.format("Welocome mr. %s",getname);

      JOptionPane.showMessageDialog(null,modifi);
        JOptionPane.showMessageDialog(null,modifi);

     //   System.out.println("you entered: "+getname);


        int x = trouble(1.0);
        System.out.println(x);


        double trouble = 100;

        System.out.println(trouble);

*/

        /*
        String nmber = String.valueOf(10);
        System.out.println(nmber);
        int i = Integer.parseInt(nmber);
        System.out.println((i+10));


        String xyz = new String(new  char[] {'2'});

        int x[] = {1,2,3};
        String name = new String(new char[]  {'a','b'});

        String name2 = " orko love you    ";
        name2 = name2.replace(' ','x');

        name2 = name2.replace('o','x');

        System.out.println(name2);



        name2 = name2.trim();

        System.out.println("after trim\n"+name2);


        if(name.equals(name2))
            System.out.println("Sekc");
        else
            System.out.println("you are not");
        name = name.toUpperCase();
        System.out.println(name);*/
/*


        int[][] multi = {{1,2},{2,3,4},{1},{2}};

        System.out.println(multi.length);

        int [][] twd = new int[10][];

        twd[0][0] =10;

        System.out.println(twd[0][0]);
*/

/*


        int a[],b[],c;
        int [] ref = new int[10];
        a = new  int[10];
        b = new int[5];



        ref = a;

        a = new  int[20];
        System.out.println(a);
        System.out.println(ref);

        ref[1]=10;
        ref[2]=30;

        System.out.println("Copyh length:"+ref.length);


        for(int i=0; i<ref.length; i++) {
            System.out.println(ref[i]);
        }

        int orginal[] = new  int[10];
        int[] copyOrginal = new  int[5];

*/



/*
        int b;
        int i =257;
        double d = 33333333333333333.141;

        int casting = (int)d;

        b = (byte) d;
        System.out.println(b);

        System.out.println(casting);*/

        /*



        System.out.println("apel\rmahmud\r");
        System.out.println("orko");

        char a = 65;
        String x = "orko";
        String y = "Orkut";

        System.out.printf("%s %s",x,"orkut");
*/
        //JLabel northLabel = new JLabel("North");

/*


        Hippo ob = new Hippo("orko","kutaa",2);

        Hippo ob2 = new Hippo(ob);
        ob.show();
        System.out.println("copy constructor");
        ob2.show();*/



    }
}
