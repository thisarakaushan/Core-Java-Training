// Switch case statement instead of if-else

package mypackage;

public class StringBestPractice4 {

	public static void main(String[] args) {

		String input = "two";
		
		switch(input) {
		
		case "one":System.out.println("print 1");
			break;
		case "two":System.out.println("print 2");
			break;
		case "three":System.out.println("print 3");
			break;
		case "four":System.out.println("print 4");
			break;
		default:
			System.out.println("invalid input!!");
		}

	}

}
