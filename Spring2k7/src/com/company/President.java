package com.company;

public class President {

    int x, y;

    public President(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void  show(President ob){

        System.out.println(ob.x);
        System.out.println(ob.y);


    }

     void  Swap(President ob,President ob2 ) {

        // ob=null;
        ob.x = 1;
        ob.y = 2;
        ob2.x = 3;
        ob2.y = 4;
        ob = ob2;

        ob = null;
    }


}
