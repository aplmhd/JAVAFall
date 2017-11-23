package com.company;

public class Main {
        public static void main(String argv[]){
            KungFu panda1 = new KungFu("panda", 33);
            KungFu panda2 = new KungFu("kai", 39);
            System.out.println(panda1.chi +" "+panda1.n);
            System.out.println(panda2.chi +" "+panda2.n);
            System.out.println(chiPower(panda2,panda1));
            panda1=panda2;
            panda2.chi="Oogway";
            System.out.println(panda1.chi +" "+panda1.n);
            System.out.println(panda2.chi +" "+panda2.n);
        }
        public static int chiPower(KungFu p1, KungFu p2){
            p2=p1;
            p1.n=500;
            return p2.n;
        }
    }

