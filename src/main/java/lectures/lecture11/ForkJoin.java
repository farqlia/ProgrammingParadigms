package lectures.lecture11;

import java.util.concurrent.ThreadLocalRandom;

public class ForkJoin {

    public static void main(String[] args) throws InterruptedException {

        int nOfThreads = 4;
        Thread[] threads = new Thread[nOfThreads];

        for (int i = 0; i < nOfThreads; i++){
            final String message = "Thread: " + i + " forked";
            threads[i] = new Thread(() -> {
                System.out.println(message);
                try {
                    Thread.sleep((ThreadLocalRandom.current().nextLong(1, 5)) * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();

        System.out.println("Main waits for all threads");

    }

}
