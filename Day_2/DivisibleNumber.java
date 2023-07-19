// Print first number divisible by 156 after 1000


package mypackage;

public class DivisibleNumber {

	public static void main(String[] args) {
		
		int n = 1000;
		while(n%156 != 0) {
			
			n++;
		}
		System.out.println(n);
	}

}
