package com.highradius.employee.management.dataaccesslayer;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.highradius.employee.management.entities.Employee;
import com.highradius.employee.management.utilities.FileConstants;
import com.highradius.employee.management.utilities.Logger;

import java.util.List;

public class EmployeeDLL {
	
	public static boolean saveEmployee(Employee emp) {
		
		try 
		{		
			FileWriter fw = new FileWriter(FileConstants.EMP_FILE_PATH, true);
			fw.write(emp.getEid()+","+emp.getEname()+","+emp.getSalary()+"\n");
			fw.close();
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}
	
	public static Employee searchEmployeeById(int empId)
	{
		Employee emp = new Employee();
		
		try 
		{
			List<String> employeesFileData = Files.readAllLines(Paths.get(FileConstants.EMP_FILE_PATH));					
			String[] tempEmployee;
			
			
			for(String fileLine: employeesFileData)
			{
				tempEmployee = fileLine.split(",");
				if(Integer.parseInt(tempEmployee[0]) == empId)
				{
					emp.setEid(empId);
					emp.setEname(tempEmployee[1]);
					emp.setSalary(Integer.parseInt(tempEmployee[2]));
					break;
				}
			}
			return emp;
		}
		catch(Exception Ex)
		{
			Logger.logErrorMessage(Ex.getMessage(), "EmployeeDLL", "searchEmployeeById");
			return emp;
		}
	}

}
