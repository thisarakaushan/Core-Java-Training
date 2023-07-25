// Write simple code to illustrate Exception Handling. Illustrate use of try, catch, finally block

package mypackage;

import java.util.Scanner;

public class IllustrateExceptionHandling {

	public static void main(String[] args) {

		float num1, num2, result;

		Scanner obj = new Scanner(System.in);

		try {
				System.out.println("Enter first number: ");
				num1 = Float.parseFloat(obj.nextLine());
	
				System.out.println("Enter second number: ");
				num2 = Float.parseFloat(obj.nextLine());
	
				result = num1 / num2;
	
				System.out.println("Answer: " + result);
				
		} catch (NumberFormatException ex) {

			System.out.println("Please again check the input. Only numbers are allowed.");
		}

		catch (Exception e) {
			System.out.println("Some errror occured. Conatct the admin.");
		}
		
		finally {
			
			System.out.println("Print any key to exit.");
			obj.close();
		}
	}

}
