/*
 Code the pattern:
 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 1 5 10 10 5 1
 */

package mypackage;

import java.util.Scanner;

public class PascalTriangle {
	
	public static int factorial(int n) {
		
		int fact = 1;
		for(int i = 1; i<n; i++) {
			fact *= i;	
		}
		return fact;
	}
	
	public static int nCr(int n, int r) {
		
		return factorial(n)/(factorial(n-r)*factorial(r));
	}

	public static void main(String[] args) {
		
		int n;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = Integer.parseInt(obj.nextLine());
		
		for(int i=0; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(nCr(i,j)+" ");
			}
			System.out.println();
		}
	}

}

// when we give n value as 20, it will give error because it's exceeded the integer range.
