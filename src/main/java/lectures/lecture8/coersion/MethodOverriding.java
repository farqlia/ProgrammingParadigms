package lectures.lecture8.coersion;

public class MethodOverriding {

    public static void main(String[] args) {

        A a = new B();
        A b = new B();
        A c = new C();

        a.printA();
        a.printB();
        a.printC();

        b.printA();
        b.printB();
        b.printC();

        c.printA();
        c.printB();
        c.printC();

        // Polymorphism also works for arrays
        B[] bs = {new B(), new C()};
        A[] as = bs;

        System.out.println();


    }

}
