package com.santiagotettamanti.doodlepropertymanagement.employee;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    EmployeeService employeeService = new EmployeeService();

    @Test
    void addEmployee() {
        Employee newEmployee = new Employee();
        newEmployee.setFirstName("Jaimicho");
        newEmployee.setLastName("Moncalico");
        newEmployee.setPhoneNumber("6825970042");
        newEmployee.setEmail("jaimicho.moncalico@live.ec");
        Employee employee = employeeService.addEmployee(newEmployee);
        assertEquals(1, employee.getEmployeeId());
    }

    @Test
    void getEmployees() {
        addEmployee();
        ArrayList<Employee> employees = employeeService.getEmployees();
        assertEquals(1, employees.size());
    }

    @Test
    void getEmployeeById() {
        addEmployee();
        Employee employee = employeeService.getEmployeeById(1);
        assertEquals(1, employee.getEmployeeId());
    }

    @Test
    void deleteEmployeeById() {
        addEmployee();
        Employee employee = employeeService.deleteEmployeeById(1);
        assertEquals(1, employee.getEmployeeId());
        assertEquals(0, employeeService.getEmployees().size());
    }

    @Test
    void updateEmployee() {
        addEmployee();
        Employee newEmployee = new Employee();
        newEmployee.setLastName("Monclave");
        Employee employee = employeeService.updateEmployee(newEmployee, 1);
        assertEquals("Monclave", employee.getLastName());
    }
}