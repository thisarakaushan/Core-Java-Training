// Insertion using StringBuilder

package mypackage;

public class StringBestPractice1 {

	public static void main(String[] args) {

		StringBuilder details = new StringBuilder(" ");
		details.append("We are in ");
		details.append("training ");
		details.append("room ");
		details.append("and learning Java.");
		
		System.out.println(details);
	}
}
