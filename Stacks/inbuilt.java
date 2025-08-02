//Java provides a Stack class as part of the Java Collections Framework. 
// However, it is recommended to use Deque interface implementations such as ArrayDeque as a stack, 
// since Stack class is considered to be a legacy class and has some performance issues.

// Using ArrayDeque as a stack:

package Stacks;
import java.util.ArrayDeque;
import java.util.Deque;
public class inbuilt {
    public class Example {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        // Adding elements (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Accessing the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Removing elements (pop)
        stack.pop();
        topElement = stack.peek();
        System.out.println("Top element after pop: " + topElement);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Get current size of the stack
        System.out.println("Stack size: " + stack.size());

        // Simulate isFull() (not applicable to ArrayDeque)
        // But we can use custom logic if needed
        System.out.println("Is stack full? " + false + " (ArrayDeque has dynamic sizing)");
    }
}
}
