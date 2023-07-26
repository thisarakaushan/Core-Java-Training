// Use .equals() with known String constants

package mypackage;

public class StringBestPractice3 {

	public static void main(String[] args) {

		String myCountry = "Sri Lanka";
		
		if (myCountry.equals("Sri Lanka"))
			System.out.println("I am at home.");
		else {
			System.out.println("I am abroad.");
		}

	}

}
