package com.santiagotettamanti.doodlepropertymanagement.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping ("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping ("/employee")
    public ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> employees = employeeService.getEmployees();
        return employees;
    }

    @PutMapping ("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        Employee updatedEmployee = employeeService.updateEmployee(employee, id);
        return updatedEmployee;
    }


}
