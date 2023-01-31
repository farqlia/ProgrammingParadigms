package concurrency.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariablesExample {

    private static MyAtomicInteger shared = new MyAtomicInteger(0);

    public static void main(String[] args) {

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++){
            threads[i] = new Thread(() -> System.out.println(Thread.currentThread().getName()
                    + ": " + getRank()), "T" + i);
        }

        for (Thread t : threads) {
            t.start();
        }

    }

    static int getRank(){
        shared.increment();
        return shared.get();
    }

}

class MyAtomicInteger extends AtomicInteger {

    public MyAtomicInteger(int value){
        super(value);
    }

    void increment(){
        incrementAndGet();
    }

}
