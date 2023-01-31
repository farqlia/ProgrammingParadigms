package concurrency.threads;

public class ThreadsExample{

    public static void main(String[] args) {

        System.out.println("START");

        Thread t1 = new Thread(() -> System.out.println("A"), "printerA");
        Thread t2 = new Thread(ThreadsExample::printB, "printerB");

        t1.start();
        t2.start();

        System.out.println("END");

    }

    static void printB(){
        System.out.println('B');
    }

}

class Printer {

    void println(String str){
        System.out.println(str);
    }

}