package com.highradius.employee.management.uilayer;

import java.util.Scanner;

import com.highradius.employee.management.businesslogiclayer.EmployeeBLL;
import com.highradius.employee.management.dataaccesslayer.EmployeeDLL;
import com.highradius.employee.management.entities.Employee;

public class EMSLaunchApp {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("=====================================");
			System.out.println("Employee Database Management System");
			System.out.println("=====================================");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee by Id");
			System.out.println("3. Search Employrr by Name");
			System.out.println("4. Display all Employees");
			System.out.println("5. Quit");
			System.out.println("Enter your choice: ");
			choice = Integer.parseInt(obj.nextLine());
			
			Employee emp = new Employee();
			int empId;
			
			switch(choice) 
			{
				case 1:
					// Read the employee details from user
					System.out.println("Enter Employee Id: ");
					emp.setEid(Integer.parseInt(obj.nextLine()));
					System.out.println("Enter Employee name: ");
					emp.setEname(obj.nextLine());
					System.out.println("Enter Employee Salary: ");
					emp.setSalary(Integer.parseInt(obj.nextLine()));
					
					String message = EmployeeBLL.addEmployee(emp);
					
					System.out.println(message);
					break;
					
				case 2:
					
					System.out.println("Enter Employee Id: ");
					empId = Integer.parseInt(obj.nextLine());
					
					emp = EmployeeDLL.searchEmployeeById(empId);
					
					if(emp.getEid()== 0)
						System.out.println("Employee not found.");
					else
						System.out.printf("Id = %d, Name = %s, Salary = %d\n", emp.getEid(), emp.getEname(), emp.getSalary());
						
				case 3:
				case 4:
				case 5:
					break;
					
				default:
					break;
			}
		}
		while(choice!=5);
		obj.close();
	}	
}