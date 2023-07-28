// Write a program to read 5 key value pairs from user and illustrate usage of any 5 HashMap predefined methods

package com.highradius.day.nine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyValuePairs = new HashMap<>();

        // Read 5 key-value pairs from the user and store them in the HashMap
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter key " + i + ": ");
            String key = scanner.next();
            System.out.print("Enter value " + i + ": ");
            int value = scanner.nextInt();
            keyValuePairs.put(key, value);
        }

        System.out.println("HashMap: " + keyValuePairs);

        // Illustrating HashMap predefined methods
        System.out.println("1. size(): " + keyValuePairs.size());
        System.out.println("2. isEmpty(): " + keyValuePairs.isEmpty());

        // Get a value using a key
        System.out.print("3. Enter a key to get the corresponding value: ");
        String searchKey = scanner.next();
        Integer value = keyValuePairs.get(searchKey);
        if (value != null) {
            System.out.println("Value for key " + searchKey + ": " + value);
        } else {
            System.out.println("Key not found!");
        }

        // Check if a key exists in the HashMap
        System.out.print("4. Enter a key to check its existence: ");
        String checkKey = scanner.next();
        boolean exists = keyValuePairs.containsKey(checkKey);
        System.out.println("Key exists: " + exists);

        // Remove a key-value pair from the HashMap
        System.out.print("5. Enter a key to remove its corresponding value: ");
        String removeKey = scanner.next();
        keyValuePairs.remove(removeKey);
        System.out.println("Key-value pair removed successfully.");

        // updated HashMap
        System.out.println("Updated HashMap: " + keyValuePairs);

        scanner.close();
    }
}
