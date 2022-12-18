package lectures.lecture8.coersion;

public class B extends A{

    public B(){
        this.attr = "B";
    }

    // Here the method is not overridden because the argument type is different
    public void m(B other) {
        System.out.print("B.m(B) ");
    }

    // Here the method is not overridden because the argument type is different
    //public void m(A other) {System.out.print("B.m(A) ");}

    public void printB(){
        System.out.println("printB: [B] -> " + attr);
    }

    public void printC(){
        System.out.println("printC: [B] -> " + attr);
    }

    // It's safe to return a subclass where the superclass is expected
    // when overriding a method
    public B getInstance(){return this;}

}
