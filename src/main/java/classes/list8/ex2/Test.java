package classes.list8.ex2;

public class Test {

    int value = 0;

    public static void main(String[] args) {
        Test mutable = new Test();
        final Test immutable = new Test();

        immutableArg(mutable);
        System.out.println(mutable.value);

        immutableArg(immutable);
        System.out.println(immutable.value);

        mutableArg(mutable);
        System.out.println(mutable.value);

        mutableArg(immutable);
        System.out.println(immutable.value);

    }

    static void immutableArg(final Test variable){
        variable.value = 1;
        //variable = null;
    }

    static void mutableArg(Test variable){
        variable.value = 2;
        variable = null;
    }

}
