package com.company.PartialIplemention;

public class PartialImplemention  {

    public static void main(String[] args) {


        Door dr;
        LocklessDoor lr;

        FullyImplementedDor fl = new FullyImplementedDor();

        dr = fl;

        dr.lock();

        lr = fl;

        lr.lock();
    }
}
