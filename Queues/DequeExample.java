package Queues;
import java.util.*;
public class DequeExample {
     public static void main(String[] args) {
        // Simulated capacity for demonstration (ArrayDeque is normally unbounded)
        final int CAPACITY = 5;
        Deque<Integer> myDeque = new ArrayDeque<>(CAPACITY);

        // push_front → add element to the front
        myDeque.addFirst(10);
        myDeque.addFirst(20);

        // push_back → add element to the back
        myDeque.addLast(30);
        myDeque.addLast(40);

        // size() → returns the number of elements
        System.out.println("Deque size: " + myDeque.size());

        // peekFirst() → get first element without removing it
        System.out.println("Front element: " + myDeque.peekFirst());

        // peekLast() → get last element without removing it
        System.out.println("Back element: " + myDeque.peekLast());

        // pop_front → remove and return the first element
        // removeFirst() throws exception if empty
        int poppedFront = myDeque.removeFirst();
        System.out.println("Popped from front (removeFirst): " + poppedFront);

        // pollFirst() → removes first element but returns null if empty
        // Difference from pop_front: pollFront avoids exception
        Integer polledFront = myDeque.pollFirst();
        System.out.println("Polled from front (pollFirst): " + polledFront);

        // pop_back → remove and return the last element
        int poppedBack = myDeque.removeLast();
        System.out.println("Popped from back (removeLast): " + poppedBack);

        // pollLast() → removes last element but returns null if empty
        Integer polledBack = myDeque.pollLast();
        System.out.println("Polled from back (pollLast): " + polledBack);

        // isEmpty() → true if no elements in deque
        System.out.println("Is deque empty? " + myDeque.isEmpty());

        // isFull() → simulated check (for learning; ArrayDeque grows automatically)
        boolean isFull = myDeque.size() >= CAPACITY;
        System.out.println("Is deque full? " + isFull);
    }
}
