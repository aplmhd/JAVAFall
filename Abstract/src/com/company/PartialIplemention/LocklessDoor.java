package com.company.PartialIplemention;

public abstract class LocklessDoor implements Door {


    @Override
    public void open() {
        System.out.println("open door");
    }

    @Override
    public void close() {
        System.out.println("close door");
    }


}
