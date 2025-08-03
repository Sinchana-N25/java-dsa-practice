package LinkedList;
import java.util.*;
public class LinkedListExample {
     public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        // Add items to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the list
        System.out.println("Numbers: " + numbers);

        // Add an item at the beginning
        numbers.addFirst(5);

        // Add an item at the end
        numbers.addLast(40);

        // Print the updated list
        System.out.println("Updated numbers: " + numbers);

        // Remove the first item
        numbers.removeFirst();

        // Print the final list
        System.out.println("Final numbers: " + numbers);
    }
}
