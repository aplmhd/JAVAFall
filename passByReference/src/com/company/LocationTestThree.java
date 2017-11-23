package com.company;

public class LocationTestThree {

    static  {

        System.out.println("Locationtest three");
    }

    public static void changeLatitutde(Location a){

        a.setLatitude(10000.0);


        a= null;

    }

    public static  void changeReference(Location a){



        System.out.println("Before new:"+a);

        a =  new Location();

        System.out.println("After new: "+a);

        a.setLatitude(123.0);
        a.setLongitutde(1234.0);

    }

    static  String n(String x){

        x="wwww";

        return x;
    }

    public static void main(String[] args) {



        String name ="aaa";

        String lname = n(name);
        System.out.println(name);



        Location ob = new Location(1,2);


        System.out.println(ob);
        changeReference(ob);

        ob.display();
        changeLatitutde(ob);

        System.out.println(ob);

        ob.display();



    }
}
