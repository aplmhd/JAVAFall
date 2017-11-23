package Problem2;

public class Main {

    public static void main(String[] args) {

        Add A = new Add(3);
        DAdd Da = new DAdd(1,5);

        A.addIt(2);

        System.out.println(A.getIt());
        A = Da;

        A.x=100;


        Da.show();

        A.addIt(2);

        System.out.println(A.getIt());

        Da.doubleIt(2);
        System.out.println(A.getIt());



    }
}
