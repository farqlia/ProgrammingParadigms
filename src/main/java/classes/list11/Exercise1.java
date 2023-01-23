package classes.list11;

import lectures.lecture8.coersion.C;

import java.util.concurrent.Semaphore;

public class Exercise1 {

    public static void main(String[] args) {

        Count c1 = new Count();
        Count c2 = new Count();

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException ex){

        }
        // The result should be 400000
        // However, threads are preempted during the increment
        // So, for example the 1st thread can be in the middle of incrementing and
        // it doesn't see the value updated by the 2nd thread
        System.out.println("The value of n is " + Count.cell.getN());

    }

}

class IntCell {
    private int n = 0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

class Count extends Thread {
    static final IntCell cell = new IntCell();
    static final Semaphore semaphore = new Semaphore(1);

    @Override
    public void run() {
        int temp;
        for (int i = 0; i < 200000; i++){
            try {
                semaphore.acquire();
                temp = cell.getN();
                cell.setN(temp + 1);
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //synchronized (cell){

            //}
        }
    }
}