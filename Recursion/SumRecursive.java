/**
 * Problem: Find the sum of all elements in an array.
 * Base Case: If index >= array length, return 0 (no elements left to add).
 * Recursive Case: Return array[index] + sumRecursive on the rest of the array.
 */
package Recursion;

public class SumRecursive {

    public static int sumRecursive(int[] array, int index) {
        if (index >= array.length) {
            return 0; // base case
        }
        return array[index] + sumRecursive(array, index + 1); // recursive case
    }
}
