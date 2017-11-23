package SixNumberSolve;

public class SubMama extends SuperMama implements BeingMama  {



    @Override
    public void show() {

    }

    //@Override
    void print() {
        System.out.println("I am choto mama");
    }

    //@Override
    public void printHi() {
        System.out.println("Hi mama");
    }

    //@Override
    public void printBye() {
        System.out.println("Print bye mama");
    }

     String encode(String name){
        return "cc";
    }

    public String decode(String name){

        return "a";
    }
}
