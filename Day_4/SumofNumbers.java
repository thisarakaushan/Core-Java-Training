package mypackage;

import java.util.Scanner;

public class SumofNumbers {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int[] numbers = new int[5];
	    int sum = 0;

	    System.out.println("Enter five numbers: ");
	        
	    for (int i = 0; i < 5; i++) {
	        	
	         numbers[i] = sc.nextInt();
	         sum += numbers[i];
	    }
	    sc.close();

	    double average = (double) sum / 5;

	    System.out.println("Sum of the numbers: " + sum);
	    System.out.println("Average of the numbers: " + average);
	}

}
