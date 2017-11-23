package com.company;

public class CommissionEmployee extends  Object {

    private final String firstName;
    private final String lastName;
    private final String socilaSecurityNumber;
    private double grossSales;
    private double commissionRate;

//    public  CommissionEmployee(){
//        firstName = null;
//        lastName = null;
//        socilaSecurityNumber = null;
//
//    }


    public CommissionEmployee(String firstName, String lastName,
                              String socilaSecurityNumber,double grossSales, double commissionRate){

        if(grossSales<0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");


        }

        if(commissionRate<0.0 || commissionRate>=1.0)
            throw new IllegalArgumentException("commission must be >0.0 and <1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socilaSecurityNumber = socilaSecurityNumber;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocilaSecurityNumber() {
        return socilaSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales<0.0)
            throw  new IllegalArgumentException("gross Sale must be >=0.0");

        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {

        if(commissionRate<=0.0 || commissionRate>=1.0)
            throw new IllegalArgumentException("Commission rate must be >0 && and <1.0");
            this.commissionRate = commissionRate;
    }

    public double earnings(){

        return  commissionRate * getGrossSales();
    }

    @Override
    public String toString() {



        //return  "a";
        return String.format("First name: %s\n Last Name :%s\n" +
                        " SocilaSecuriy: %s\n grossSales: %s\n commision: %s",firstName,
                lastName, socilaSecurityNumber,grossSales,commissionRate);
    }


}
