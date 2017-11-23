package com.company;

public class Main {

    String fname;
    String lname;
    String location;
    String subject;
    String CC;


    public static void main(String[] args) {


        MailSent obj = new MailSent();

        obj.setInfo("Dhaka","Bogra","orko","orkut","nothing","CC");

        obj.show();

    }
}
