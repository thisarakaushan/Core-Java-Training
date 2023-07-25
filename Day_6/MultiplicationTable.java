// Create a simple application to print a multiplication table of a given number.

package mypackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	    	
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the number for multiplication table: ");
	    int number = Integer.parseInt(scanner.nextLine());

	    System.out.println("Multiplication Table of " + number + ":");
	    for (int i = 1; i <= 10; i++) {
	    	int result = number * i;
	        System.out.println(number + " x " + i + " = " + result);
	     }
	    System.out.println("press some key to end the program.");
	    scanner.hasNextLine();

	    scanner.close();
	    }
}
