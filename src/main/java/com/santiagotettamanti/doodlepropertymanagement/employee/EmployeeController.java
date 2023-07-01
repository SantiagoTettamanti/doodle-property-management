package com.santiagotettamanti.doodlepropertymanagement.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping
    public Employee getAllEmployees() {
        return null; //for now, you know it's coming ;D
    }
}
