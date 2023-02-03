package classes.list11.ex3;

public class BoundedBuffer implements Produce, Consume {
    final private int N;
    private int in = 0, out = 0, n = 0;
    private int[] elems;

    public BoundedBuffer(int N) {
        this.N = N; elems = new int[N]; 
    }

    public synchronized void put(int x) {
        while (n >= N) 
          try {
        	  System.out.println("   " + Thread.currentThread().getName()+" waiting with " + x);
        	  wait(); 
          } catch (InterruptedException e) {System.out.println(e);}
        elems[in] = x; in = (in + 1) % N ; n += 1; 
        System.out.println(" " + Thread.currentThread().getName()+" produced: " + x);
         // norifyAll informs all threads waiting for some condition to be met
        if (n == 1) notify();
    }

    // those two methods are marked as synchronized - it means that other
    // methods which invoke synchronized methods will have to wait
    public synchronized int take() {
        while (n == 0) // it can't be 'if' because even if a thread is released, the condition
            // may change
          try {
        	  System.out.println("   " + Thread.currentThread().getName() + " waiting");
        	  wait(); 
          } catch (InterruptedException e) {System.out.println(e);}
        int x = elems[out]; out = (out + 1) % N ; n -= 1;
        System.out.println(" " + Thread.currentThread().getName() +" consuming: " + x);
        if (n == N-1) notify();
        return x;
    }
}

