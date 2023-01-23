package lectures.lecture11;

public class WaitingState implements Runnable {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingState());
        t1.start();
        System.out.println("[main] t1 is in state = " + WaitingState.t1.getState());
    }

    public void run() {
        Thread t2 = new Thread(new DemoWaitingStateRunnable());
        t2.start();
        System.out.println("[t1.run] t2 is in state = " + t2.getState());

        try {
            // join() makes the current thread (the one which is executing this block)
            // wait for the thread on which this method is invoked to die.
            t2.join();
            System.out.println("[t1.run] t2 is in state = " + t2.getState());
            System.out.println("[t1.run] t1 is in state = " + WaitingState.t1.getState());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

class DemoWaitingStateRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        System.out.println("[t2.run] t1 is in state = " + WaitingState.t1.getState());
    }
}
