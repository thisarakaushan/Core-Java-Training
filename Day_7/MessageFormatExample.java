// Write example code to illustrate use of MessageFormat.

package mypackage;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {

		String name = "Thisara";
		String university = "KIIT University";
		int year = 4;
		
		// Not best method
		String details = "I am "+name+" from "+university+". I am "+year+"th year student.";
		System.out.println(details);
		
		System.out.println("\n");
		
		// best method
		String myDetails = MessageFormat.format("I am {0} from {1}. I am {2}th year student.", name, university, year);
		System.out.println(myDetails);

	}

}
