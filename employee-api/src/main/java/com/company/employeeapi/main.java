package com.company.employeeapi;
import java.util.List;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        // Instantiate the EmployeeController
        EmployeeController employeeController = new EmployeeController();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get employee details
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int employeeAge = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double employeeSalary = scanner.nextDouble();

        // Create employee
        Employee newEmployee = new Employee(employeeId, employeeName, employeeAge, employeeSalary);
        employeeController.createEmployee(newEmployee);
        System.out.println("Employee created successfully!");

        // Get employee by employee ID
        System.out.print("Enter employee ID to retrieve: ");
        int searchEmployeeId = scanner.nextInt();
        Employee retrievedEmployee = employeeController.getEmployeeById(searchEmployeeId);
        if (retrievedEmployee != null) {
            System.out.println("Retrieved employee details:");
            System.out.println("ID: " + retrievedEmployee.getId());
            System.out.println("Name: " + retrievedEmployee.getName());
            System.out.println("Age: " + retrievedEmployee.getAge());
            System.out.println("Salary: " + retrievedEmployee.getSalary());
        } else {
            System.out.println("Employee not found");
        }

        // Update employee
        System.out.print("Enter employee ID to update: ");
        int updateEmployeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter updated employee name: ");
        String updatedEmployeeName = scanner.nextLine();

        System.out.print("Enter updated employee age: ");
        int updatedEmployeeAge = scanner.nextInt();

        System.out.print("Enter updated employee salary: ");
        double updatedEmployeeSalary = scanner.nextDouble();

        Employee updatedEmployee = new Employee(updateEmployeeId, updatedEmployeeName, updatedEmployeeAge, updatedEmployeeSalary);
        employeeController.updateEmployee(updateEmployeeId, updatedEmployee);
        System.out.println("Employee updated successfully!");

        // Delete employee by employee ID
        System.out.print("Enter employee ID to delete: ");
        int deleteEmployeeId = scanner.nextInt();
        employeeController.deleteEmployeeById(deleteEmployeeId);
        System.out.println("Employee deleted successfully!");

        // Get all employees
        List<Employee> allEmployees = employeeController.getAllEmployees();
        if (allEmployees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("All employees:");
            for (Employee employee : allEmployees) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Age: " + employee.getAge());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("------------------");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
