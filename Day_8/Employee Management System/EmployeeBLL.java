package com.highradius.employee.management.businesslogiclayer;

import java.util.Scanner;
import com.highradius.employee.management.entities.Employee;
import com.highradius.employee.management.dataaccesslayer.EmployeeDLL; 

public class EmployeeBLL {
	
	Scanner empScanner = new Scanner(System.in);
	
	public static String addEmployee(Employee emp) {
		
		// Logic for validation
		StringBuilder message = new StringBuilder();
		if(emp.getEid()<0)
			message.append("Invalid Employee Id\n");
		if(emp.getEname().length()<5)
			message.append("Employee name should be greater than 5 character.");
		if(emp.getSalary()<70000)
			message.append("Employee salary should be greater than 700000");
		
		if(message.length()==0) 
		{
			if(EmployeeDLL.saveEmployee(emp))
				return "Saved Successfully.";
			else
				return "Unable to save details.";
		}
		else 
			return message.toString();
	}
	
	public static Employee searchEmployeeById(int empId)
	{
		Employee emp = EmployeeDLL.searchEmployeeById(empId);
		return emp;
	}
}
