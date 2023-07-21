package mypackage;

import java.util.Scanner;

public class SearchOccurrence {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers: ");
        
        for (int i = 0; i < 5; i++) {
        	
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the search number: ");
        int searchNumber = sc.nextInt();
        
        sc.close();

        int occurrenceCount = countOccurrences(numbers, searchNumber);
        System.out.println("The search number occurred: " + occurrenceCount);
    }

    public static int countOccurrences(int[] arr, int searchNumber) {
        int count = 0;
        for (int num : arr) {
            if (num == searchNumber) {
                count++;
            }
        }
        return count;
    }
}
