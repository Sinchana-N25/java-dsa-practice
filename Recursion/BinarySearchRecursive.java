/**
 * Problem: Perform a recursive binary search to find the index of an element in a sorted array.
 * Base Case: If start > end, return -1 (item not found).
 * Recursive Case: Compare mid element with item:
 *    - If equal, return mid.
 *    - If mid < item, search right half.
 *    - If mid > item, search left half.
 */
package Recursion;

public class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] array, int item, int start, int end) {
        if (start > end) {
            return -1; // base case
        }
        int mid = start + (end - start) / 2;

        if (array[mid] == item) {
            return mid;
        } else if (array[mid] < item) {
            return binarySearchRecursive(array, item, mid + 1, end); // search right half
        } else {
            return binarySearchRecursive(array, item, start, mid - 1); // search left half
        }
    }
}
