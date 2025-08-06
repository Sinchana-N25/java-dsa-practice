package HashSets;

import java.util.*;
public class HashSetExample {                                    // This code demonstrates how to:
    public static void main(String[] args) {                      // 1. Create a HashSet
        // Create a new HashSet                                   // 2. Add elements
        HashSet<String> fruits = new HashSet<>();                 // 3. Check if an element exists
                                                                  // 4. Remove an element
        // Add elements to the set                                // 5. Get the size of the set
        fruits.add("Apple");                                      // 6. Clear all elements
        fruits.add("Banana");                                     // 7. Loop through the set
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate will be ignored

        // Check if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set!");
        } else {
            System.out.println("Banana is not in the set!");
        }

        // Remove an element
        fruits.remove("Cherry");

        // Get size of the set
        System.out.println("Size of set: " + fruits.size());

        // Loop through set (order is not guaranteed)
        System.out.println("\nAll fruits in the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("\nSet after clearing: " + fruits);
    }
}
