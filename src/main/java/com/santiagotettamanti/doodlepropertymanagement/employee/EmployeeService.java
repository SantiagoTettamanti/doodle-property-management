package com.santiagotettamanti.doodlepropertymanagement.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {
    private ArrayList<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeId(employees.size() + 1);
        employees.add(employee);
        return employee;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public Employee getEmployeeById(int id) {
        for(int i=0; i<employees.size();i++) {
            Employee currentEmployee = employees.get(i);        //save the current employee from the loop in a variable "currentEmployee"
            int employeeId = currentEmployee.getEmployeeId();   //find the ID of that employee with the method created in the Employee class (the getter)
            if(employeeId==id) {                               // check if the employeeId is the same as the one provided in the parameter
                return currentEmployee;                        // return that employee if ^ is true
            }
        }
        return null;                                           // otherwise return null
    }

    public Employee deleteEmployeeById(int id) {
        for(int i=0; i<employees.size(); i++) {
            if(employees.get(i).getEmployeeId()==id) {
                return employees.remove(i);
            }
        }
        return null;
    }

    public Employee updateEmployee(Employee employeeChanges, int id) {
        Employee employeeToUpdate = getEmployeeById(id);
        String newFirstName = employeeChanges.getFirstName();
        if (newFirstName != null) {
            employeeToUpdate.setFirstName(newFirstName);
        }
        String newLastName = employeeChanges.getLastName();
        if (newLastName != null) {
            employeeToUpdate.setLastName(newLastName);
        }
        String newEmail = employeeChanges.getEmail();
        if (newEmail != null) {
            employeeToUpdate.setEmail(newEmail);
        }
        String newPhoneNumber = employeeChanges.getPhoneNumber();
        if (newPhoneNumber != null) {
            employeeToUpdate.setPhoneNumber(newPhoneNumber);
        }
        return employeeToUpdate;
    }
}
