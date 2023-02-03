package lectures.eg;

public class Base {

    protected static int k;

    public Base() { k++; }

    public Base(int i) {}

    public Base(int i, int j) {}

    public void m(int i) {
        System.out.println("Wartosc = " + i);
    }

}
