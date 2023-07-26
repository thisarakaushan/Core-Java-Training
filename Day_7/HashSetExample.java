// Write example program to illustrate usage of HashSet.

package mypackage;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
    public static void main(String[] args) {
    	
        // Create a new HashSet to store strings
        Set<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        // Display the elements in the HashSet
        System.out.println("HashSet elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if an element exists in the HashSet
        String searchFruit = "Mango";
        if (fruits.contains(searchFruit)) {
            System.out.println("\n"+searchFruit + " exists in the HashSet.");
        } else {
            System.out.println(searchFruit + " does not exist in the HashSet.");
        }

        // Remove an element from the HashSet
        String removeFruit = "Banana";
        fruits.remove(removeFruit);

        // Display the updated elements in the HashSet
        System.out.println("\nUpdated HashSet elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of the HashSet
        int size = fruits.size();
        System.out.println("\nSize of the HashSet: " + size);

        // Clear the HashSet
        fruits.clear();

        // Check if the HashSet is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);
    }
}
