package com.company.ExtraInterFace;

public class CarDoor extends WhatCanIextend implements  BasicDoor,LockableDoor {


    boolean isLocked = false;


    @Override
    public void unlock() {
        isLocked = false;

    }

    @Override
    public void lock() {

        isLocked = true;

    }

    @Override
    public void close() {
        System.out.println("close door");

    }

    @Override
    public void open() {

        if(isLocked !=true)
            System.out.println("Door open");

    }


}
