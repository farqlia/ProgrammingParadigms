package lectures.lecture8.coersion;

public class Coersion {

    public static void main(String[] args) {

        int i = 5;
        double f = 4.3;

        /*
        Addition operators + are overloaded for numerical types
        So the second argument is converted to double
        We can think of four possible overloaded methods
         */
        System.out.println(f + i);

        // + can also be used as a concatenation for String types
        System.out.println("five=5" == ("five=" + 5));

        /*
        In Java we have automatic conversions between primitive types
        and their corresponding wrapper classes
         */
        Integer i1 = 1;
        Integer someInt = Integer.valueOf(1);

        int i2 = someInt;

        /* Testing methods of the same name but different signature */
        A a = new A();
        B b = new B();

        a.m(a);
        b.m(a);

        a.m(b);
        b.m(b);

    }

}
