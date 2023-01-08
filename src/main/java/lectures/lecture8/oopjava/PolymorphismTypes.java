package lectures.lecture8.oopjava;

public class PolymorphismTypes {

    public static void main(String[] args) {

        A a = new B();

        B b = new B();

        // Compiler only wants to make sure
        // that the reference type contains a method
        // with an appropriate signature
        // During runtime however, it will choose
        // the most specific version available
        a.m(a);
        a.m(b);

        b.m(a);
        b.m(b);

    }

}
