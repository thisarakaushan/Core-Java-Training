package mypackage;

import java.util.Scanner;

public class ReadNumebrsUsingSplit {

	public static void main(String[] args) {
		
		int sum = 0;
		String allNumbers;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any count of numbers: ");
		allNumbers = sc.nextLine();
		
		String[] numbers = allNumbers.split(",");
		
		for(String n: numbers) {
			
			sum+=Integer.parseInt(n);
		}
		System.out.println(sum);
		
		sc.close();
	}

}
