package Stacks;
import java.util.ArrayDeque;
import java.util.Deque;
public class inbuilt_isfull {
    public class StackExample {
    static final int MAX_SIZE = 5; // Simulated limit

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        // ✅ Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Simulated isFull()
        boolean isFull = (stack.size() == MAX_SIZE);
        System.out.println("Is stack full? " + isFull); // true

        // Trying to push beyond limit
        if (isFull) {
            System.out.println("Cannot push: Stack is full.");
        } else {
            stack.push(60);
        }

        // Print current stack size
        System.out.println("Stack size: " + stack.size());
    }
}
}
