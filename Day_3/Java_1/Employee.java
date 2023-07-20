package mypackage;

import java.util.Scanner;

public class Employee {
	
	private int id;
	private String ename;
	private int salary;
	private static String company = "Highradius";
	
	public void getEmpData() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter ID: ");
		id = Integer.parseInt(obj.nextLine());
		System.out.println("Enter EmpName: ");
		ename = obj.nextLine();
		System.out.println("Enter EmpSalary: ");
		salary = Integer.parseInt(obj.nextLine());
		
		obj.close();
	}
	
	public void printEmpData() {
		
		System.out.println("ID: "+id);
		System.out.println("Name "+ename);
		System.out.println("Salary "+salary);
		System.out.println("Company "+company);
	}
}
