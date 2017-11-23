package com.company;

public class MailSent {

    Main encap = new Main();

    String form;
    String to;

    void  setInfo(String form, String to, String fname, String lname,
                  String subject, String CC){

        this.form =form;
        this.to = to;
        encap.fname = fname;
        encap.lname = lname;
        encap.subject = subject;
        encap.CC =CC;

    }

    void  show(){

        System.out.println(form);
        System.out.println(to);
        System.out.println(encap.fname);
        System.out.println(encap.lname);
        System.out.println(encap.subject);
        System.out.println(encap.CC);

    }


}
