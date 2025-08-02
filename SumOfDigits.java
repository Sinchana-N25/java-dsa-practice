/*
 * Problem: Sum of digits of a number (e.g. 123 → 6)
 * Approach: Base case when number is 0. Else, last digit + sum of remaining.
 */
public class SumOfDigits {
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(12345)); // Output: 15
    }
}
