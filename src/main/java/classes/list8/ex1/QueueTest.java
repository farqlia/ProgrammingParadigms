package classes.list8.ex1;

import java.awt.*;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>(4);

        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
        } catch (FullException e){

        }

        try {
            queue.enqueue(5);
        } catch (FullException e){
            System.out.println("Queue is full!");
        }

        try {
            System.out.println(queue.first());
            queue.dequeue();
            System.out.println(queue.first());
            queue.dequeue();
            System.out.println(queue.first());
            queue.dequeue();
            System.out.println(queue.first());
            queue.dequeue();
        } catch (EmptyException e){
            System.out.println("Queue is empty!");
        }

        try {
            queue.first();
        } catch (EmptyException e){
            System.out.println("Queue is empty!");
        }

    }

}
