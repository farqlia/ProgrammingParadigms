package lectures.lecture8.coersion;

public class A {

    protected String attr = "A";

    public void m(A other) {
        System.out.print("A.m(A) ");
    }

    public void printA(){
        System.out.println("printA: [A] -> " + attr);
    }

    public void printB(){
        System.out.println("printB: [A] -> " + attr);
    }

    public void printC(){
        System.out.println("printC: [A] -> " + attr);
    }

    public A getInstance(){return this;}
}
