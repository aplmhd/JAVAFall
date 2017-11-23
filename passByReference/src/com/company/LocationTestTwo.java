package com.company;

public class LocationTestTwo {




    public static void shallowSwap(Location a, Location b){

        System.out.println("Before shallowswap");

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        Location temp = a;
        a = b;
        b = temp;

        System.out.println("After shallowswap");

        System.out.println("a: "+a);
        System.out.println("b: "+b);



    }

    public static void  deepSwap( Location a, Location b){

        double lat = a.getLatitude();
        double longi = a.getLongitutde();

        System.out.println(" before deep swap");


        a.setLatitude(b.getLatitude());
        a.setLongitutde(b.getLongitutde());

        b.setLatitude(lat);
        b.setLongitutde(longi);


    }
/*
    void onlySwap(Location a){

        Location b = new Location();
        a=b;

        a.setLatitude(10000);

    }*/




    public static void main(String[] args) {




        Location dhaka = new Location(1.0,2.0);
        Location sandiago = new Location(3.0,4.0);

        System.out.println("Before dhaka: "+dhaka);
        dhaka.onlySwap(dhaka);
        System.out.println("After Dhaka: "+dhaka);
        System.out.println(dhaka.getLatitude());


        shallowSwap(dhaka,sandiago);



        System.out.println("\n\n");

        System.out.println(dhaka);
        System.out.println(sandiago);

        dhaka.display();
//
//        deepSwap(dhaka,sandiago);
//
//        System.out.println(dhaka);
//        System.out.println(sandiago);
//
//        dhaka.display();
//        sandiago.display();

    }
}
