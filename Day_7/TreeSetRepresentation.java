package mypackage;

import java.util.TreeSet;

public class TreeSetRepresentation {
	
    public static void main(String[] args) {
    	
        TreeSet<Integer> treeSet = new TreeSet<>();

        long startTime = System.nanoTime();

        // Adding 100,000 elements to the TreeSet
        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }

        // Checking if an element exists in the TreeSet
        boolean exists = treeSet.contains(50000);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("TreeSet Insertion and Lookup Time: " + duration + " nanoseconds");
        System.out.println("Element exists in TreeSet: " + exists);
    }
}
