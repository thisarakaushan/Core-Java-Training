package mypackage;

public class ValidCountryCode {
	public static void main(String[] args) {
		String  countryCode = "India";
		boolean isValid = isValidCountry(countryCode);
		System.out.println(isValid);
	}
	public static boolean isValidCountry(String countryCode) {
		return "India".equalsIgnoreCase(countryCode);
	}
}
