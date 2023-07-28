/*
 Read number of rows to be printed and print pascal's triangle in pyramid format.

Input: 4

       1
    1  1
 1   2   1
1  3   3   1

 */

package com.highradius.day.nine;

import java.util.Scanner;

public class PascalsTriangle {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows to be printed: ");
        int numRows = scanner.nextInt();

        // Print Pascal's Triangle
        printPascalTriangle(numRows);

        scanner.close();
    }
    
    /**
     * Method to print the Pascal's Triangle
     * @param numRows
     */
    public static void printPascalTriangle(int numRows) {
    	
        for (int i = 0; i < numRows; i++) {
        	
            // Print spaces for pyramid format
            for (int j = 0; j < numRows - i; j++) {
            	
                System.out.print(" ");
            }
 
            int num = 1;
            for (int j = 0; j <= i; j++) {
            	
                System.out.print(num + " ");

                // Calculate the next number using the previous number
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

