//implementing a basic stack to reverse a string using the stack's LIFO property
package Stacks;
public class reverse_string {
static class Stack {
    private static final int STACK_CAPACITY = 101;
    private char[] stackArray = new char[STACK_CAPACITY];
    private int topIndex = -1;

    void push(char character) {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else{
            topIndex++;
            stackArray[topIndex]=character;
        }
        // If stack is full (check using isFull function)
        // Then print "Stack is full"
        // Otherwise add the next element at topIndex + 1 and update topIndex
    }

    char pop() {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return '-';
        }
        else{
            char character=stackArray[topIndex];
            topIndex--;
            return character;
        }
        // If the stack is empty (check using isEmpty function)
        // Then print "Stack is empty" and return '-1'
        // Otherwise return the element at the topIndex
        // But reduce topIndex before returning the element
    }

    boolean isEmpty() {
        return topIndex == -1;
    }

    boolean isFull() {
        return topIndex >= STACK_CAPACITY - 1;
    }
}

class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int inputLength = inputString.length();

        Stack charStack = new Stack();

        // Push each character onto the stack
        for (int i = 0; i < inputLength; i++) {
            char currentChar = inputString.charAt(i);
            charStack.push(currentChar);
        }

        // Pop the characters from the stack to construct the reversed string
        StringBuilder reversedString = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedString.append(charStack.pop());
        }

        System.out.println(reversedString.toString());
    }
}
}
