package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    int eid;
    String ename;
    double salary;
    String designation;

    public Employee(int eid, String ename, double salary, String designation) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation + "]";
    }
}

public class EmployeeApplication {

    public static List<Employee> employees = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("==================");
            System.out.println("Menu:");
            System.out.println("==================:");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by Id");
            System.out.println("3. Search Employee by name");
            System.out.println("4. Delete Employee by Id");
            System.out.println("5. Display all employee details");
            System.out.println("6. Quit");
            System.out.print("Enter your choice (1-6): ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    searchEmployeeById();
                    break;
                case 3:
                    searchEmployeeByName();
                    break;
                case 4:
                    deleteEmployeeById();
                    break;
                case 5:
                	displayEmployees();
                    break;
                case 6:
                    System.out.println("Quitting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }

    public static void addEmployee() {
    	
        System.out.print("Enter Employee ID: ");
        int eid = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Employee Name: ");
        String ename = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Employee Designation: ");
        String designation = scanner.nextLine();

        Employee emp = new Employee(eid, ename, salary, designation);
        employees.add(emp);

        System.out.println("Employee added successfully!");
    }

    public static void searchEmployeeById() {
    	
        System.out.print("Enter the Employee ID to search: ");
        int searchId = Integer.parseInt(scanner.nextLine());

        for (Employee emp : employees) {
        	
            if (emp.eid == searchId) {
            	
                System.out.println("Employee found: " + emp);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void searchEmployeeByName() {
    	
        System.out.print("Enter the Employee Name to search: ");
        String searchName = scanner.nextLine();

        for (Employee emp : employees) {
        	
            if (searchName.equals(emp.ename)) {
            	
                System.out.println("Employee found: " + emp);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void deleteEmployeeById() {
    	
        System.out.print("Enter the Employee ID to delete: ");
        int deleteId = Integer.parseInt(scanner.nextLine());

        for (Employee emp : employees) {
        	
            if (emp.eid == deleteId) {
            	
                employees.remove(emp);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void displayEmployees() {
    	
        System.out.println("List of employees:");
        for (Employee emp : employees) {
        	
            System.out.println(emp);
        }
    }
}
