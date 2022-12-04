package classes.list6;

public class Aliasing {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3};
        System.out.println("--1--");
        for (int i : ints){
            System.out.println(i); i = 0;
        }
        System.out.println("--2--");
        for (int i : ints){
            System.out.println(i);
        }
        int[] ints2 = ints;
        System.out.println("--3--");
        for (int i = 0; i < ints2.length; i++){
            System.out.println(ints2[i]); ints2[i] = -1;
        }
        System.out.println("--4--");
        for (int i : ints){
            System.out.println(i);
        }
    }

}
