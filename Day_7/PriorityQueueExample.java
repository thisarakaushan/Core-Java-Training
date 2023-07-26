// Write example program to illustrate PriorityQueue.

package mypackage;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
    	
        // Create a new PriorityQueue of integers 
        Queue<Integer> data = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        data.add(10);
        data.add(5);
        data.add(15);
        data.add(3);
        data.add(8);
        
        System.out.println("Size: "+data.size());
        	
        System.out.println("\nPeek elements: "+data.peek()); 

        System.out.println("\n");
        
        System.out.println("Elements: ");
        // Retrieves and removes the head of the queue (in ascending order)
        while (!data.isEmpty()) {
        	
            System.out.println(data.poll()); 
        }
        
        System.out.println("\nPeek elements: "+data.peek()); 
        
    }
}
