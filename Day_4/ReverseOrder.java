package mypackage;

import java.util.Scanner;

public class ReverseOrder {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[5];

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
        	
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Numbers in reverse order of entering: ");
        
        for (int i = 4; i >= 0; i--) {
        	
            System.out.print(numbers[i] + " ");
        }
    }
}
