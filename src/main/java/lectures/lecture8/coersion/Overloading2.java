package lectures.lecture8.coersion;

public class Overloading2 {

    public static void main(String[] args) {

        A aa = new B();
        B bb = new B();

        // Kompilator sprawdza typ referencji, czy tam
        // ta metoda istnieje, a typ referencji argumentu
        // decyduje, ktora wersja metody
        // Potem w czasie wykonywania programu sprawdzany
        // jest typ właściwy
        aa.m(aa);
        aa.m(bb);
        bb.m(aa);
        bb.m(bb);

    }

}
