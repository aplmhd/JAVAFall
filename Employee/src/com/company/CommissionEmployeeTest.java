package com.company;

public class CommissionEmployeeTest {


    public static void main(String[] args) {


        CommissionEmployee employee = new CommissionEmployee("orko","Orkiut",
                "111",100,.9);


        System.out.println(employee.getFirstName());
        //System.out.println(employee);
        System.out.println(employee.earnings());

       // employee.setCommissionRate(10);
    }




}
