package classes.list8.ex1;

import java.util.ArrayList;
import java.util.List;

public class Queue<E> implements MyQueue<E> {

    private int f;
    private int r;
    private final int n;
    private final List<E> array;

    public Queue(int size){
        n = size + 1;
        array = new ArrayList<>(n);
        for (int i = 0; i < n; i++) array.add(null);
        f = 0;
        r = 0;
    }

    public void enqueue(E x) throws FullException {
        if (isFull()) throw new FullException();
        else {
            array.set(r, x);
            System.out.println(array);
            r = (r + 1) % n;
        }
    }

    @Override
    public void dequeue() {
        if (!isEmpty()) f = (f + 1) % n;
        System.out.println(array);
    }

    @Override
    public E first() throws EmptyException {
        if (isEmpty()) throw new EmptyException();
        else return array.get(f);
    }

    @Override
    public boolean isEmpty() {
        return r == f;
    }

    @Override
    public boolean isFull() {
        return (r + 1) % n == f;
    }

}
