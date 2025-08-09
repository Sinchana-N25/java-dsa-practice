package Queues;
import java.util.*;
public class isFull {
     static final int MAX_SIZE = 5; // Simulated capacity
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // ✅ Enqueue elements (add to the back of the queue)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Simulated isFull() check
        boolean isFull = (queue.size() == MAX_SIZE);
        System.out.println("Is queue full? " + isFull); // true

        // Trying to enqueue beyond limit
        if (isFull) {
            System.out.println("Cannot enqueue: Queue is full.");
        } else {
            queue.add(60);
        }

        // Print current queue size
        System.out.println("Queue size: " + queue.size());
    }
}
