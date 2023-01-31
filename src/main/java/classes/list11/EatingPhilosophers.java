package classes.list11;

import java.util.concurrent.Semaphore;

public class EatingPhilosophers {

    static Semaphore[] sticks = new Semaphore[5];
    static {
        for (int i = 0; i < 5; i++) sticks[i] = new Semaphore(1);
    }

    public static void main(String[] args) {

        Philosopher[] philosophers = new Philosopher[5];

        for (int i = 0; i < 5; i++) philosophers[i] = new Philosopher(i);

        for (Philosopher philosopher : philosophers) philosopher.start();
    }

}

class Philosopher extends Thread {

    int id;
    static final Semaphore sentinel = new Semaphore(4);

    public Philosopher(int id){
        super("P" + id);
        this.id = id;
    }

    private void eat(){
        try {

            System.out.println(Thread.currentThread().getName() + " tries to enter the dinning hall");
            sentinel.acquire();
            System.out.println(" " + Thread.currentThread().getName() + " has entered the dinning hall");

            EatingPhilosophers.sticks[id].acquire();
            System.out.println("  " + Thread.currentThread().getName() + " obtained the left stick");

            EatingPhilosophers.sticks[(id + 1) % 5].acquire();
            System.out.println("   " + Thread.currentThread().getName() + " obtained the right stick");

            System.out.println("    " + Thread.currentThread().getName() + " eating");
            Thread.sleep(2000);
            System.out.println("    " + Thread.currentThread().getName() + " done eating");

            System.out.println("   " + Thread.currentThread().getName() + " put down the left stick");
            EatingPhilosophers.sticks[id].release();

            System.out.println("  " + Thread.currentThread().getName() + " put down the right stick");
            EatingPhilosophers.sticks[(id + 1) % 5].release();

            System.out.println(" " + Thread.currentThread().getName() + " is leaving the dinning hall");
            sentinel.release();
            System.out.println(Thread.currentThread().getName() + " has left the dinning hall");


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) eat();

    }
}
