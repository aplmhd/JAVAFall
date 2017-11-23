package Habijabi;

public class Main {





    static  String[] c(String[] name){

        name[0]="tui";

        return  name;
    }

    public static void main(String[] args) {


        int arr[] = {1,2,2};
        System.out.println(arr.length);

        String[] name = {"orko"};

        name = c(name);

        System.out.println(name[0]);
    }
}
