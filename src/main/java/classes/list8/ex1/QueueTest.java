package classes.list8.ex1;

import java.awt.*;

public class QueueTest {

    public static void main(String[] args) {

        testQueue2();

    }

    private static void testQueue1(){
        Queue<Integer> queue = new Queue<>(4);

        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
        } catch (FullException e){
            System.out.println("!!!");
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
            System.out.println("!!!");
        }

        try {
            queue.first();
        } catch (EmptyException e){
            System.out.println("Queue is empty!");
        }
    }

    private static void testQueue2(){

        Queue<Integer> queue = new Queue<>(1);

        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
        } catch (FullException e){
            System.out.println("!!!");
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
            System.out.println("!!!");
        }

        try {
            queue.first();
        } catch (EmptyException e){
            System.out.println("Queue is empty!");
        }

        try {
            queue.enqueue(6);
            queue.enqueue(7);
            queue.enqueue(8);
            queue.enqueue(9);
        } catch (FullException e){
            System.out.println("!!!");
        }

        try {
            queue.enqueue(10);
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
            System.out.println("!!!");
        }

        try {
            queue.first();
        } catch (EmptyException e){
            System.out.println("Queue is empty!");
        }

        try {
            queue.enqueue(10);
            System.out.println(queue.first());
        } catch (FullException | EmptyException e){
            System.out.println("!!!");
        }


        try {
            queue.enqueue(10);
        } catch (FullException e){
            System.out.println("Queue is full!");
        }

    }


}
