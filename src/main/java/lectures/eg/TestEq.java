package lectures.eg;

public class TestEq {

    private int value;

    public TestEq(int value){
        this.value = value;
    }

    public boolean equals(TestEq other){return value == other.value;}

    public static void main(String[] args) {

        TestEq t1 = new TestEq(8);
        TestEq t2 = new TestEq(8);

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals((Object) t2));
        System.out.println(t1.value == t2.value);

    }

}
