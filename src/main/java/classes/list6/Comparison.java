package classes.list6;

public class Comparison {

    public static void main(String[] args) {

        String s1 = "foo";
        String s2 = "foo";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("foo");

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = s3.intern();

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);


    }

}
