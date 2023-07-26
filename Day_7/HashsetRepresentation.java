package mypackage;

import java.util.HashSet;

public class HashsetRepresentation  {
	
    public static void main(String[] args) {
    	
        HashSet<Integer> hashSet = new HashSet<>();

        long startTime = System.nanoTime();

        // Adding 100,000 elements to the HashSet
        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        
        // Checking if an element exists in the HashSet
        boolean exists = hashSet.contains(50000);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("HashSet Insertion and Lookup Time: " + duration + " nanoseconds");
        System.out.println("Element exists in HashSet: " + exists);
    }
}
