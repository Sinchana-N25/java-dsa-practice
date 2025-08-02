/*
 * Problem: Print numbers from 1 to N using recursion
 * Approach: First print smaller numbers (1...n-1), then n
 */
public class print1toN {
    public static void printUp(int n) {
        if (n == 0) return;
        printUp(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printUp(5); // Output: 1 2 3 4 5
    }
}
