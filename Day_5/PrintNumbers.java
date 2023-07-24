/*
Write a simple program to store 10 integers in ArrayList
[ Initialize the numbers during declaration itself ]

Requirement:
Print numbers using for loop (two ways), forEach
Print even numbers using for loop ( for(int d:data) )

 */

package mypackage;

import java.util.Arrays;
import java.util.List;

public class PrintNumbers {

	public static void main(String[] args) {
		
		// int MAX = 10;
		
		//int[] numbers = new int[MAX];
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
				
		// for loop
		System.out.println("Using for loop: ");
		for(int i=0; i<numbers.size(); i++) {
			
			System.out.println(numbers.get(i));
		}

		// for each
		System.out.println("Using for each: ");
		for(int n:numbers) {
			
			System.out.println(n);
		}
		
		// using foreach 
		System.out.println("Using forEach: ");
		numbers.forEach(num-> System.out.println(num));
	}
}
