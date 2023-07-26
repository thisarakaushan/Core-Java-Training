// Write example program to read numbers from user in the same line (as discussed in the class )

package mypackage;

import java.text.MessageFormat;
import java.util.Scanner;

public class ReadNumbersFromSameLine {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter 3 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(MessageFormat.format("Numers are {0}, {1} and {2}.", a, b, c));
		
		sc.close();
	}
}
