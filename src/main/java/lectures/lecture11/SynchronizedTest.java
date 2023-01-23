package lectures.lecture11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedTest {

    @Test
    void givenMultiThreading_whenNoSync() throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);

        SynchronizedMethods summation = new SynchronizedMethods();

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::calculate));

        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        Assertions.assertEquals(1000, summation.getSum());

    }

    @Test
    void givenMultiThreading_whenSync() throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);

        SynchronizedMethods summation = new SynchronizedMethods();

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::synchCalculate));

        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        Assertions.assertEquals(1000, summation.getSum());

    }

    @Test
    void givenMultiThreading_whenReetrantLock() throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);
        final Object lock = new Object();
        Runnable r = () -> {
            synchronized (lock) {
                System.out.println("First time acquiring it");

                synchronized (lock) {
                    System.out.println("Entering again");

                    synchronized (lock) {
                        System.out.println("And again");
                    }
                }
            }
        };

        IntStream.range(0, 3).forEach(count -> service.submit(r));

        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

    }

    @Test
    void givenMultiThreading_whenLockOnObject() throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizeOnObject objectWithSynch = new SynchronizeOnObject();

        IntStream.range(0, 2).forEach(count -> service.submit(() -> {
            objectWithSynch.method1();
            objectWithSynch.method2();
        }));

       // service.awaitTermination(0, TimeUnit.MILLISECONDS);

        service.awaitTermination(10000, TimeUnit.MILLISECONDS);

    }


}

class SynchronizedMethods {

    private int sum = 0;

    public synchronized void synchCalculate(){
        calculate();
    }

    public void calculate() {
        setSum(getSum() + 1);
    }

    // standard setters and getters
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}

class SynchronizeOnObject {

    void method1(){

        System.out.println(Thread.currentThread().getName() + " enters method1");
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + " in critical section method1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " leaves method1");

    }

    void method2(){

        System.out.println(Thread.currentThread().getName() + " enters method2");
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + " in critical section method2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " leaves method2");

    }

}
