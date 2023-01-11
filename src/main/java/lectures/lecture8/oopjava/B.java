package lectures.lecture8.oopjava;

public class B extends A {

    // ad-hoc polymorphism
    public void m(B b){
        System.out.println("B.m(b)");
    }

    // for polymorphic method call we have dynamic binding
    @Override
    public void m(A a){
        System.out.println("B.m(a)");
    }

}
