package lectures.eg;

public class B extends A{

    public B(){k++;}

    public static void main(String[] args) {
        System.out.println("BEFORE: " + k);
        B w = new B();
        System.out.println("AFTER: " + k);
        w.mA();
    }

}
