package lectures.lecture11;

public class ProducerConsumerProblem {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();
        (new Producer("Producer", buffer)).start();
        (new Consumer("Consumer", buffer)).start();
    }

}


class Buffer {

    private String msg;
    private boolean empty = true;

    public synchronized void put(String msg){

        while (!empty){
            try {
                // the current thread releases the lock
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println(Thread.currentThread().getName() + " puts " + msg);
        this.msg = msg;
        empty = false;
        notifyAll();

    }

    public synchronized String take(){
        while (empty){
            try {
                // the current thread releases the lock
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println(Thread.currentThread().getName() + " takes " + msg);
        empty = true;
        notifyAll();
        return msg;
    }

}

class Producer extends Thread {

    private Buffer buffer;

    public Producer(String name, Buffer buffer){
        super(name);
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            buffer.put("m" + i);
        }
        buffer.put("Done");
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(String name, Buffer buffer){
        super(name);
        this.buffer = buffer;
    }

    @Override
    public void run() {
        String msg = "";
        do {
            msg = buffer.take();
        } while (!msg.equals("Done"));
    }
}
