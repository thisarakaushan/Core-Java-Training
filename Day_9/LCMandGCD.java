// Read 3 numbers from user and print LCM and GCD

package com.highradius.day.nine;

import java.util.Scanner;

public class LCMandGCD {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Read 3 numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find GCD and LCM
        int gcd = findGCD(num1, num2, num3);
        int lcm = findLCM(num1, num2, num3);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        scanner.close();
    }

    /**
     * Method to find GCD of two numbers
     * @param a
     * @param b
     * @return
     */
    public static int findGCD(int a, int b) {
        if (b == 0) 
        {
            return a;
        } 
        else 
        {
            return findGCD(b, a % b);
        }
    }

    /**
     * Method to find GCD of three numbers
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int findGCD(int a, int b, int c) {
        return findGCD(a, findGCD(b, c));
    }

    /**
     * Method to find LCM of two numbers
     * @param a
     * @param b
     * @return
     */
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    /**
     * Method to find LCM of three numbers
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int findLCM(int a, int b, int c) {
        return findLCM(a, findLCM(b, c));
    }
}
