/**
 * Problem: Count the number of elements in an array.
 * Base Case: If index >= array length, return 0 (no elements left to count).
 * Recursive Case: Return 1 + countRecursive on the rest of the array.
 */
package Recursion;

public class CountRecursive {

    public static int countRecursive(int[] array, int index) {
        if (index >= array.length) {
            return 0; // base case
        }
        return 1 + countRecursive(array, index + 1); // recursive case
    }
}
