package mypackage;

public class UseEquals {
	public static void main(String[] args) {
		String password1 = "hrc123";
	    String password2 = "hrc123";
	    
	    boolean isValidPassword = isValid(password1, password2);
		System.out.println(isValidPassword);
	}
	public static boolean isValid(String password1, String password2) {
		return password1.equals(password2);
	}
}
