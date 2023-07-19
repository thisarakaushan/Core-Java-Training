/*
Read no. of rows to be printed from user and print output.

5 4 3 2 1
5 4 3 2
5 4 3 
5 4
5  
*/

package mypackage;

import java.util.Scanner;

public class DrawPattern3 {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        for (int i = rows; i >= 1; i--) {
	        	
	            for (int j = 1; j <= i; j++) {
	            	
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
}
