package classes.list8.ex1;

public class QueueArr<E> implements MyQueue<E>{

    E[] array;
    int f;
    int r;

    QueueArr(int size){
        array = (E[])(new Object[size + 1]);
        f = 0;
        r = 0;
    }

    @Override
    public void enqueue(E x) throws FullException {
        if (isFull()) throw new FullException();
        else {
            array[r] = x;
            r = (r + 1) % array.length;
        }
    }

    @Override
    public void dequeue() {
        if (!isEmpty()) f = (f + 1) % array.length;
    }

    @Override
    public E first() throws EmptyException {
        if (isEmpty()) throw new EmptyException();
        else return array[f];
    }

    @Override
    public boolean isEmpty() {
        return r == f;
    }

    @Override
    public boolean isFull() {
        return (r + 1) % array.length == f;
    }
}
