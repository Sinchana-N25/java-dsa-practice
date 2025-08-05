/**
 * Problem: Find the maximum value in an array.
 * Base Case: If index is the last element, return that element.
 * Recursive Case: Find max in the rest of the array, then return max of current element and that.
 */
package Recursion;

public class MaxValueArray {

    public static int maxRecursive(int[] array, int index) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        if (index == array.length - 1) {
            return array[index]; // base case
        }
        int subMax = maxRecursive(array, index + 1); // recursive case
        return Math.max(array[index], subMax);
    }
}
