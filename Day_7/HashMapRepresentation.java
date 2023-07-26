// Write example program to illustrate usage of HashMap

package mypackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapRepresentation  {
	
    public static void main(String[] args) {
    	
        // Create a new HashMap to store key-value pairs
        Map<String, Integer> scores = new HashMap<String, Integer>();

        // Add some data to the HashMap
        scores.put("English", 85);
        scores.put("Maths", 92);
        scores.put("Science", 78);
        scores.put("Buddhism", 95);

        // Accessing elements in the HashMap
        int engScore = scores.get("English");
        int mathsScore = scores.get("Maths");

        System.out.println("English score: " + engScore ); 
        System.out.println("Maths score: " + mathsScore); 

        // Check if a key exists in the HashMap
        String subject = "Science";
        if (scores.containsKey(subject )) {
            int scienceScore  = scores.get(subject );
            System.out.println(subject  + " score: " + scienceScore);
        } else {
            System.out.println(subject + " not found in the HashMap.");
        }

        System.out.println("\n");
        
        // for each
        for(String key: scores.keySet()) {
        	
        	System.out.println(key+":"+scores.get(key));
        }
        
        System.out.println("\n");
        
        // using forEach
        scores.forEach((key, value) -> System.out.println(key+":"+value));
        
        System.out.println("\n");
        
        // Iterating through the HashMap
        System.out.println("All scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String subject1 = entry.getKey();
            int score = entry.getValue();
            System.out.println(subject1+ ": " + score);
        }
    }
}
