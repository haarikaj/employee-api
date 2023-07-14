package com.company.employeeapi;
import org.junit.Test;
import static org.junit.Assert.*;


public class EmployeeControllerTest {

    @Test
    public void testGetId() {
        
        Employee employee = new Employee(1, "Haarika", 23, 25000.0);

        
        int id = employee.getId();

        
        assertEquals(1, id);
    }

    @Test
    public void testGetName() {
       
        Employee employee = new Employee(1, "Haarika", 23, 25000.0);

        
        String name = employee.getName();

      
        assertEquals("Haarika", name);
    }

    @Test
    public void testGetAge() {
        
        Employee employee = new Employee(1, "Haarika", 23, 25000.0);

        
        int age = employee.getAge();

       
        assertEquals(23, age);
    }

    @Test
    public void testGetSalary() {
       
        Employee employee = new Employee(1, "Haarika", 23, 25000.0);

       
        double salary = employee.getSalary();

    
        assertEquals(25000.0, salary, 0.0);
    }

    @Test
    public void testSetName() {
        
        Employee employee = new Employee(1, "Haarika", 23, 25000.0);

       
        employee.setName("Anika");

        
        assertEquals("Anika", employee.getName());
    }

    @Test
    public void testSetAge() {
       
        Employee employee = new Employee(1, "Haarika", 23, 25000.0);

        
        employee.setAge(30);

        
        assertEquals(30, employee.getAge());
    }

    @Test
    public void testSetSalary() {
 
        Employee employee = new Employee(1, "Haarika", 23, 25000.0);

      
        employee.setSalary(26000.0);

        assertEquals(26000.0, employee.getSalary(), 0.0);
    }
}

