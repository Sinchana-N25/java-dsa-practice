package Stacks;

public class peek_empty_full {
    static final int MAX_SIZE = 101;
    static int[] a = new int[MAX_SIZE];
    static int top=0;
    static int peek() {
    if (top >= 0) {
        int ele = a[top];
        System.out.println("Peeked: " + ele);
        return ele;
    } else {
        System.out.println("Stack is empty. Cannot peek.");
        return -1;
    }
}

static boolean is_empty() {
    return top == -1;
}

static boolean is_full() {
    return top == MAX_SIZE-1;
}

}
