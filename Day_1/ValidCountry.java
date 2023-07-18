package mypackage;

public class ValidCountry {

	public static void main(String[] args) {
		String country = "India";
		    
		boolean isValidCountry = isValidCountry(country);
		System.out.println(isValidCountry);
	}
	public static boolean isValidCountry(String country) {
		return country.equals("India");
	}
}
