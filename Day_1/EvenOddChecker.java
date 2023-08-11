/*
A Even is a natural number which is divisible by 2. For example 2, 4, 6, 8, 10,….. are even numbers. 
Write a program that's can detect and tell us weather the number given is even or odd.
 */

 import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }
}