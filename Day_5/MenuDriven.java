/*
Create a menu driven application with below options:
Add Name
Search Name
Delete Name (if present)
Display all names
Quit

Hint : Use ArrayList

 */

package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDriven {

	public static List<String> names = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int choice;
		do {
			System.out.println("==================");
			System.out.println("Menu:");
			System.out.println("==================:");
			System.out.println("1. Add Name");
			System.out.println("2. Search Name");
			System.out.println("3. Delete Name");
			System.out.println("4. Display all names");
			System.out.println("5. Quit");
			System.out.print("Enter your choice (1-5): ");

			choice = Integer.parseInt(scanner.nextLine());

			/*
			 * choice = scanner.nextInt(); scanner.nextLine();
			 */

			switch (choice) {
			case 1:
				addName();
				break;
			case 2:
				searchName();
				break;
			case 3:
				deleteName();
				break;
			case 4:
				displayName();
				break;
			case 5:
				System.out.println("Quitting the program...");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
				break;
			}
		} while (choice != 5);

		scanner.close();
	}

	public static void addName() {

		System.out.println("Enter the name to add: ");
		String newName = scanner.nextLine();
		names.add(newName);
		System.out.println("Name added successfully!");
	}

	public static void searchName() {

		System.out.print("Enter the name to search: ");
		String searchName = scanner.nextLine();
		if (names.contains(searchName)) {
			System.out.println("Name found in the list!");
		} 
		else {
			System.out.println("Name not found in the list!");
		}
	}

	public static void deleteName() {

		System.out.print("Enter the name to delete: ");
		String deleteName = scanner.nextLine();
		if (names.remove(deleteName)) {
			System.out.println("Name deleted successfully!");
		} 
		else {
			System.out.println("Name not found in the list!");
		}
	}

	public static void displayName() {

		System.out.println("List of names:");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
