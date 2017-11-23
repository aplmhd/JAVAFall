package com.company.twob;

public class MasterShifu {
    public static void main(String[] args) {
        Panda panda = new Panda();
        Dragon dragon = new Dragon();
        Warrior warrior;
        panda.msg="Want to be a Panda.";
        dragon.msg="Stop Kai.";
        panda.info();
        dragon.info();
        warrior=panda;
        warrior.msg="I found my father.";
        warrior.info();
        warrior=dragon;
        warrior.msg="Want to learn chi.";
        warrior.info();
    }
}
