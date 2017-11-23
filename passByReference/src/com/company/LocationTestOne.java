package com.company;

public class LocationTestOne {

    static void   change(Location a){

        a.setLatitude(9999);
       // a= null;
        System.out.println(a);
        System.out.println(a.getLatitude());
    }

    public static void main(String args[]){


        Location dhaka = new Location(12.0,3.5);

        String name = dhaka.abal();

       // System.out.println(name);

        Location unknown = dhaka;

        unknown.setLongitutde(11111);

        change(unknown);
        unknown.display();

        //System.out.println(dhaka);
        //System.out.println(unknown);
    }
}
