package lectures.lecture8.coersion;

public class Test {

    public static void main(String[] args) {

        int a = 5;
        System.out.println("five=5" == ("five=" + a));

        System.out.println("five=5" == ("five=" + 5));

        System.out.println("five=5".equals("five=" + a));

        // boxing
        Integer w1 = new Integer(5);

        // unboxing
        int i1 = w1.intValue();

        // Gdy bedzie null to wyjatek
        // ogolnie dla a.equals(b) chcemy miec pewnosc ze a nie jest null
        Integer w2 = 5;

        int i2 = w2;

    }

}
