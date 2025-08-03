package Recursion;
/*
 * Problem: Find nth Fibonacci number using recursion
 * fib(0) = 0, fib(1) = 1
 * fib(n) = fib(n-1) + fib(n-2)
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 7; // Example: 0 1 1 2 3 5 8
        System.out.println(fib(n)); // Output: 13
    }
}
