package LinkedList;
import java.util.*;
public class Methods1 {
     public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // -------------------- ADD METHODS --------------------

        // add(E e): Appends the specified element to the end of this list.
        list.add("A");

        // add(int index, E element): Inserts the specified element at the specified position.
        list.add(1, "B");

        // addAll(Collection<E> c): Appends all elements from specified collection to end.
        List<String> extra = Arrays.asList("C", "D");
        list.addAll(extra);

        // addAll(int index, Collection<E> c): Inserts all elements from collection starting at index.
        list.addAll(2, Arrays.asList("X", "Y"));

        // addFirst(E e): Inserts at the beginning.
        list.addFirst("Start");

        // addLast(E e): Appends at the end.
        list.addLast("End");

        System.out.println("After add operations: " + list);

        // -------------------- CLEAR --------------------

        // clear(): Removes all elements.
        LinkedList<String> clearList = new LinkedList<>(list);
        clearList.clear();
        System.out.println("After clear(): " + clearList);

        // -------------------- CLONE --------------------

        // clone(): Returns shallow copy of the list.
        LinkedList<String> clonedList = new LinkedList<>(list);
        //list.clone();
        System.out.println("Cloned list: " + clonedList);

        // -------------------- CONTAINS --------------------

        // contains(Object o): Returns true if list contains the element.
        System.out.println("Contains 'X'? " + list.contains("X"));

        // -------------------- DESCENDING ITERATOR --------------------

        // descendingIterator(): Returns iterator in reverse order.
        System.out.print("Descending order: ");
        Iterator<String> descending = list.descendingIterator();
        while (descending.hasNext()) {
            System.out.print(descending.next() + " ");
        }
        System.out.println();

        // -------------------- GET METHODS --------------------

        // get(int index): Returns element at index.
        System.out.println("Element at index 2: " + list.get(2));

        // getFirst(): Returns first element.
        System.out.println("First element: " + list.getFirst());

        // getLast(): Returns last element.
        System.out.println("Last element: " + list.getLast());

        // -------------------- INDEX METHODS --------------------

        // indexOf(Object o): First occurrence index.
        System.out.println("Index of 'X': " + list.indexOf("X"));

        // lastIndexOf(Object o): Last occurrence index.
        list.add("X");  // Add duplicate to demonstrate
        System.out.println("Last index of 'X': " + list.lastIndexOf("X"));

        // -------------------- LIST ITERATOR --------------------

        // listIterator(int index): ListIterator starting from index.
        ListIterator<String> listIterator = list.listIterator(2);
        System.out.print("ListIterator from index 2: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // -------------------- OFFER METHODS --------------------

        // offer(E e): Adds element at end.
        list.offer("Offer");

        // offerFirst(E e): Inserts at front.
        list.offerFirst("OfferFirst");

        // offerLast(E e): Inserts at end.
        list.offerLast("OfferLast");

        System.out.println("After offer methods: " + list);

        // -------------------- PEEK METHODS --------------------

        // peek(): Retrieves head without removing.
        System.out.println("Peek(): " + list.peek());

        // peekFirst(): Retrieves first element, or null if empty.
        System.out.println("PeekFirst(): " + list.peekFirst());

        // peekLast(): Retrieves last element, or null if empty.
        System.out.println("PeekLast(): " + list.peekLast());
    }
}

