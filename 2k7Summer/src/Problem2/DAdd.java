package Problem2;

public class DAdd extends  Add {


    int x=50;

   public void  show(){

       System.out.println(super.x);    }


    protected int i;



    public DAdd(int a, int b) {
        super(a);

        i =b;

    }
    void pvschild(){

        System.out.println("Child"+i);
        System.out.println("Parent"+super.i);
    }

    protected void addIt(int amount){
       // System.out.println("this is super i"+super.i);
        i=i*super.i+amount;

    }

    protected int getIt(){

        return i+1;
    }

    protected void doubleIt(int amount){

        addIt(2*amount);
    }
}
