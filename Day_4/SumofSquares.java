package mypackage;

import java.util.Scanner;

public class SumofSquares {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int[] numbers = new int[5];
	    int sumofSquare  = 0;

	    System.out.println("Enter five numbers: ");
	        
	    for (int i = 0; i < 5; i++) {
	        	
	         numbers[i] = sc.nextInt();
	         sumofSquare += numbers[i] * numbers[i];
	    }
	    
	    sc.close();
	    
	    System.out.println("Sum of Squares of the numbers: " + sumofSquare);
	}
}

