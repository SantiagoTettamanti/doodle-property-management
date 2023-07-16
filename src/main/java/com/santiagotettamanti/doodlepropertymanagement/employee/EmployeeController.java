package com.santiagotettamanti.doodlepropertymanagement.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping ("/employee")
    public ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> employees = employeeService.getEmployees();
        return employees;
    }
}
