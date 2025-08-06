package HashMaps;

 import java.util.*;
public class HashMapExample {                                          // This code demonstrates how to:
     public static void main(String[] args) {                              // 1.Create a HashMap
        // Create a new HashMap                                               2.Add key-value pairs
        HashMap<String, Integer> ages = new HashMap<>();                   // 3.Retrieve values
                                                                           // 4.Check if a key exists
        // Add key-value pairs to the map                                     5.Update values
        ages.put("Alice", 25);                                   // 6.Remove key-value pairs
        ages.put("Bob", 30);                                     // 7.Iterate over all entries
        ages.put("Carol", 35);

        // Get a value from the map
        int bobAge = ages.get("Bob");
        System.out.println("Bob's age: " + bobAge);

        // Check if a key exists
        if (ages.containsKey("David")) {
            System.out.println("David's age is known");
        } else {
            System.out.println("David's age is unknown");
        }

        // Update a value
        ages.put("Alice", 26);

        // Remove a key-value pair
        ages.remove("Carol");

        // Print all entries
        System.out.println("\nAll entries:");
        for (String name : ages.keySet()) {
            System.out.println(name + ": " + ages.get(name));
        }
    }
}
