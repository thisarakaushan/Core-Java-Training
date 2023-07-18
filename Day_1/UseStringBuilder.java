package mypackage;

public class UseStringBuilder {

	public static void main(String[] args) {
		String name = "ABC.";
		String email = "abc@gmail.com.";
		String work = "Trainee.";
		String company = "ABC Company.";
		
		String details = buildData(name, email, work, company);
		System.out.println(details);
	}
	public static String buildData(String name, String email,String work, String company){
			
		StringBuilder details = new StringBuilder(" ");
		details.append("I am ").append(name);
		details.append("My Email is ").append(email);
		details.append("I work as ").append(work);
		details.append("I work for ").append(company);
			
		return  details.toString();
	}
}
