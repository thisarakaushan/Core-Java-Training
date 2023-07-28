/* Read 10 numbers from the user into ArrayList.
Read search element from user and print how many times the search element occurred in the ArrayList.
*/

package com.highradius.day.nine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementInArrayList {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Read 10 numbers from the user and store them in the ArrayList
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Read the search element from the user
        System.out.print("Enter the search element: ");
        int searchElement = scanner.nextInt();

        // Count the occurrences of the search element in the ArrayList
        int count = 0;
        for (int num : numbers) {
        	
            if (num == searchElement) {
            	
                count++;
            }
        }

        System.out.println("The search element " + searchElement + " occurred " + count + " times in the ArrayList.");
        scanner.close();
    }
}
