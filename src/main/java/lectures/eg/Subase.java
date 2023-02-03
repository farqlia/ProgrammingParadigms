package lectures.eg;

public class Subase extends Base {

    //public Subase(int i, int j) {super(i, j);}

    //public Subase(int i) {}

    public Subase(){ k++ ;}

    public void m(int i) {
        System.out.println("Ta wartosc = " + i);
    }
    public void m(String s) {
        System.out.println("Przekazano = " + s);
    }

    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Subase();
        b1.m(6);
        b2.m(5);
        System.out.println(k);
    }

}
