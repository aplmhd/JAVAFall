package TestPack;

public class Main {

    public static void main(String[] args) {


        Test x = new Test(1,2,3);

        System.out.println(x);

        int a[]={1,2,3};
        Test ob = new Test();

        ob.ara(a);

        System.out.println(a[0]);
        System.out.println(ob);
    }


}
