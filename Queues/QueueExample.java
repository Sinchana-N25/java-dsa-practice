package Queues;

import java.util.*;
public class QueueExample {
    public static void main(String[] args) {

        // Create a Queue using LinkedList implementation
        // Queue<String> means it will store String elements
        Queue<String> customerQueue = new LinkedList<>();

        // add() → inserts an element at the rear (end) of the queue
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");

        // size() → returns number of elements currently in the queue
        System.out.println("Queue size: " + customerQueue.size());

        // peek() → views the front element without removing it
        // Returns null if queue is empty
        System.out.println("Front customer (peek): " + customerQueue.peek());

        // remove() → removes and returns the front element
        // Throws NoSuchElementException if queue is empty
        String servedCustomer = customerQueue.remove();
        System.out.println("Served customer (remove): " + servedCustomer);

        System.out.println("New queue size: " + customerQueue.size());
        System.out.println("New front customer: " + customerQueue.peek());

        // poll() → removes and returns the front element
        // Returns null if queue is empty (difference from remove)
        String polledCustomer = customerQueue.poll();
        System.out.println("Polled customer (poll): " + polledCustomer);

        // isEmpty() → returns true if queue has no elements
        System.out.println("Is queue empty? " + customerQueue.isEmpty());

        // NOTE: Java's built-in Queue has no isFull()
        // because it's usually unbounded unless using a fixed-size implementation
    }
}
