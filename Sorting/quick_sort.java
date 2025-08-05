package Sorting;

import java.util.*;
public class quick_sort {

    public static List<Integer> quicksort(List<Integer> array) {
        // Base case
        if (array.size() < 2) {
            return array;
        } else {
            int pivot = array.get(0);

            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();

            for (int i = 1; i < array.size(); i++) {
                if (array.get(i) <= pivot) {
                    less.add(array.get(i));
                } else {
                    greater.add(array.get(i));
                }
            }

            List<Integer> sorted = new ArrayList<>();
            sorted.addAll(quicksort(less));
            sorted.add(pivot);
            sorted.addAll(quicksort(greater));

            return sorted;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 2, 3);
        System.out.println(quicksort(numbers));
    }
}
