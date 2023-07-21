package mypackage;

import java.util.Scanner;

public class OccurrenceofPrimeNumbers {
    
    public static boolean isPrime(int num) {
    	
        if (num < 2) {
        	
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
            	
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        int primeCount = 0;
        
        System.out.println("Enter five numbers greater than or equal to 2: ");
        
        for (int i = 0; i < 5; i++) {
        	
            numbers[i] = sc.nextInt();
            if (isPrime(numbers[i])) {
            	
                primeCount++;
            }
        }
        
        sc.close();
        
        System.out.println("Number of prime numbers: " + primeCount);
    }
}

