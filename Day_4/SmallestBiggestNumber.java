package mypackage;

import java.util.Scanner;

public class SmallestBiggestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < 5; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Biggest number: " + max);

	}

}
