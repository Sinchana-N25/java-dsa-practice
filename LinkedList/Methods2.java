package LinkedList;
import java.util.*;
public class Methods2 {
     public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five", "Three"));

        // -------------------- POLL METHODS --------------------

        // poll(): Retrieves and removes the head (first element) of this list.
        System.out.println("poll(): " + list.poll());

        // pollFirst(): Retrieves and removes the first element, or null if empty.
        System.out.println("pollFirst(): " + list.pollFirst());

        // pollLast(): Retrieves and removes the last element, or null if empty.
        System.out.println("pollLast(): " + list.pollLast());

        System.out.println("List after polls: " + list);

        // -------------------- POP & PUSH METHODS --------------------

        // push(E e): Pushes an element onto the stack (adds to head).
        list.push("PushedElement");
        System.out.println("After push: " + list);

        // pop(): Pops an element from the stack (removes from head).
        System.out.println("pop(): " + list.pop());
        System.out.println("After pop: " + list);

        // -------------------- REMOVE METHODS --------------------

        // remove(): Retrieves and removes the head (first element).
        System.out.println("remove(): " + list.remove());

        // remove(int index): Removes element at specified position.
        System.out.println("remove(1): " + list.remove(1));

        // remove(Object o): Removes first occurrence of the specified element.
        list.remove("Three");
        System.out.println("After remove(\"Three\"): " + list);

        // removeFirst(): Removes and returns first element.
        list.addFirst("Alpha");
        System.out.println("removeFirst(): " + list.removeFirst());

        // removeLast(): Removes and returns last element.
        System.out.println("removeLast(): " + list.removeLast());

        // removeFirstOccurrence(Object o): Removes first occurrence (head to tail).
        list.add("X");
        list.add("Y");
        list.add("X");
        list.removeFirstOccurrence("X");
        System.out.println("After removeFirstOccurrence(\"X\"): " + list);

        // removeLastOccurrence(Object o): Removes last occurrence (head to tail).
        list.removeLastOccurrence("X");
        System.out.println("After removeLastOccurrence(\"X\"): " + list);

        // -------------------- SET --------------------

        // set(int index, E element): Replaces element at given position.
        list.set(0, "Z");
        System.out.println("After set(0, \"Z\"): " + list);

        // -------------------- SIZE --------------------

        // size(): Returns number of elements.
        System.out.println("Size of list: " + list.size());

        // -------------------- SPLITERATOR --------------------

        // spliterator(): Creates a fail-fast Spliterator.
        Spliterator<String> spliterator = list.spliterator();
        System.out.print("Using spliterator: ");
        spliterator.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

        // -------------------- TOARRAY --------------------

        // toArray(): Returns Object[] of list elements.
        Object[] objectArray = list.toArray();
        System.out.println("toArray(): " + Arrays.toString(objectArray));

        // toArray(T[] a): Returns typed array.
        String[] typedArray = list.toArray(new String[0]);
        System.out.println("toArray(new String[0]): " + Arrays.toString(typedArray));

        // -------------------- TOSTRING --------------------

        // toString(): Returns string representation of list.
        System.out.println("toString(): " + list.toString());
    }
}
