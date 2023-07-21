/*
 Code the pattern
 1
 2 6 
 3 7 10 
 4 8 11 13
 5 9 12 14 15
 */

package mypackage;

import java.util.Scanner;

public class Pattern {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
        	
            int num = i;
            
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(num + " ");
                num += n - j;
            }
            System.out.println();
        }
    }
}
