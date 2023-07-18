package mypackage;

public class UseSwitchCase {

	public static void main(String[] args) {
		String shortCode = "Start";
		String fullForm = customerTypeFullForm(shortCode);
		System.out.println(fullForm);

	}
	public static String customerTypeFullForm(String shortCode) {
		String fullForm;
		
		switch(shortCode) {
		case "Start":
			fullForm  = "Startup";
			break;
		case "Prop":
			fullForm = "Sole Proprietorship";
			break;
		case "Small":
			fullForm = "Small Company";
			break;
		case "Big":
			fullForm = "Big Company";
			break;
		default:
			fullForm = "Enterprise";
			break;
		}
		return fullForm;
	}
}
