package lectures.lecture11;

public class CyclicProducerConsumer {

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(5);
        new Producer2("Producer", buffer).start();
        new Consumer2("Consumer", buffer).start();
    }

}

interface Produce {
    void put(int val);
}

interface Consume {
    int take();
}

class Producer2 extends Thread {

    private Produce buffer;

    public Producer2(String name, Produce buffer){
        super(name);
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(getName() + " producing " + i);
            buffer.put(i);
        }
    }
}

class Consumer2 extends Thread {

    private Consume buffer;

    public Consumer2(String name, Consume buffer){
        super(name);
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(getName() + " consumed " + buffer.take());
        }
    }
}

class BoundedBuffer implements Produce, Consume{

    final private int N;
    private int in = 0, out = 0, n = 0;
    private int[] elems;

    public BoundedBuffer(int N){
        this.N = N;
        elems = new int[N];
    }

    public synchronized void put(int x){

        while (n >= N){
            try {
                System.out.println(Thread.currentThread().getName() + " waiting");
                wait();
            } catch (InterruptedException e) {}
        }

        elems[in] = x;
        in = (in + 1) % N;
        n += 1;
        System.out.println(Thread.currentThread().getName() + " putting " + x);
        for (int e : elems)
            System.out.print(e + " ");
        System.out.println();

        if (n == 1) notifyAll();

    }

    public synchronized int take(){
        while (n == 0){
            try {
                System.out.println(Thread.currentThread().getName() + " waiting");
                wait();
            } catch (InterruptedException e) {}
        }
        int x = elems[out];
        elems[out] = 0;
        out = (out + 1) % N;
        n -= 1;
        if (n == N - 1) notifyAll();
        return x;
    }

}