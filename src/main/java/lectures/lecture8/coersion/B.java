package lectures.lecture8.coersion;

public class B extends A{

    public B(){
        this.attr = "B";
    }

    public void m(B other) {
        System.out.print("B.m(B) ");
    }

    public void printB(){
        System.out.println("printB: [B] -> " + attr);
    }

    public void printC(){
        System.out.println("printC: [B] -> " + attr);
    }

}
