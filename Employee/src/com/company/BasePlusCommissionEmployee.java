package com.company;

public class BasePlusCommissionEmployee extends  CommissionEmployee {

    private  double baseSallary;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSale,
                                      double commissionRate, double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSale,commissionRate);

        if(baseSalary <0.0) {

            throw  new IllegalArgumentException("Base salary must be >=0.0");

        }
        this.baseSallary = baseSalary;


    }


    public double getBaseSallary() {
        return baseSallary;
    }

    public void setBaseSallary(double baseSallary) {
        if (baseSallary<0.0)
            throw  new  IllegalArgumentException("Base salary must be >0.0");

        this.baseSallary = baseSallary;
    }

    @Override
    public double earnings(){
        return baseSallary +(getCommissionRate() * getGrossSales());
    }


    @Override
    public String toString() {



        //return  "a";
        return String.format("First name: %s\n Last Name :%s\n" +
                        " SocilaSecuriy: %s\n grossSales: %s\n commision: %s\n base: %s",getFirstName(),
                getLastName(), getSocilaSecurityNumber(),getGrossSales(),getCommissionRate(),baseSallary);
    }


}
