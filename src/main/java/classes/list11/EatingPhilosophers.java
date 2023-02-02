package classes.list11;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class EatingPhilosophers {

    static final int NUMBER_OF_PHILOSOPHERS = 5;
    static final long MAX_TIME = 1000;
    static final int MAX_RUNS = 10;
    static final Semaphore doorkeeper = new Semaphore(NUMBER_OF_PHILOSOPHERS - 1);
    static final Semaphore[] sticks = new Semaphore[NUMBER_OF_PHILOSOPHERS];
    static final Philosopher[] philosophers = new Philosopher[NUMBER_OF_PHILOSOPHERS];

    public static void main(String[] args) {

        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            sticks[i] = new Semaphore(1);
            philosophers[i] = new Philosopher(i);
        }

        for (Philosopher philosopher : philosophers)
            philosopher.start();
    }

}

class Philosopher extends Thread {

    int id;

    public Philosopher(int id){
        super("P" + id);
        this.id = id;
    }

    private void mediate(){
        System.out.println(Thread.currentThread().getName() + " is meditating");
        try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(EatingPhilosophers.MAX_TIME));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " finished meditating");
    }

    private void eat(){
        try {

            System.out.println(Thread.currentThread().getName() + " tries to enter the dinning hall");
            EatingPhilosophers.doorkeeper.acquire();
            System.out.println(" " + Thread.currentThread().getName() + " has entered the dinning hall");

            EatingPhilosophers.sticks[id].acquire();
            System.out.println("  " + Thread.currentThread().getName() + " has taken the left stick");

            EatingPhilosophers.sticks[(id + 1) % EatingPhilosophers.NUMBER_OF_PHILOSOPHERS].acquire();
            System.out.println("   " + Thread.currentThread().getName() + " has taken the right stick");

            System.out.println("    " + Thread.currentThread().getName() + " is eating");
            Thread.sleep(ThreadLocalRandom.current().nextLong(EatingPhilosophers.MAX_TIME));
            System.out.println("    " + Thread.currentThread().getName() + " has finished eating");

            System.out.println("   " + Thread.currentThread().getName() + " has put down the left stick");
            EatingPhilosophers.sticks[id].release();

            System.out.println("  " + Thread.currentThread().getName() + " has put down the right stick");
            EatingPhilosophers.sticks[(id + 1) % EatingPhilosophers.NUMBER_OF_PHILOSOPHERS].release();

            System.out.println(" " + Thread.currentThread().getName() + " is leaving the dinning hall");
            EatingPhilosophers.doorkeeper.release();
            System.out.println(Thread.currentThread().getName() + " has left the dinning hall");


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {

        for (int i = 0; i < EatingPhilosophers.MAX_RUNS; i++) {
            mediate();
            eat();
        }

    }
}

