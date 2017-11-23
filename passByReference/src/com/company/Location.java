
package com.company;

public class Location {

    private double latitude;
    private  double longitutde;



    public Location(){


    }

    public Location(double latitude, double longitutde){

        this.latitude = latitude;
        this.longitutde = longitutde;

    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitutde(double longitutde) {
        this.longitutde = longitutde;
    }

    public double getLongitutde() {
        return longitutde;
    }

    public double getLatitude() {
        return latitude;
    }
/*
   public String toString(){


        return  latitude+"  "+longitutde;
    }*/

static  {

    System.out.println("Location static field");
}

    void onlySwap(Location a) {

        Location b = new Location();
        a = b;

        a.setLatitude(10000);
    }


    String abal(){

       return "aaa";
    }

    void display(){


        System.out.println(latitude +"   "+ longitutde);
    }





}
