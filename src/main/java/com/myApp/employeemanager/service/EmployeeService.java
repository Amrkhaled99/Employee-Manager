package com.myApp.employeemanager.service;

import com.myApp.employeemanager.exception.UserNotFoundException;
import com.myApp.employeemanager.model.Employee;
import com.myApp.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    // Add Employee
    public Employee editEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    // Update Employee
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    // Delete Employee
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    // Get ALL Employees
    public Employee findEmployeeById(Long id) {
//        return employeeRepo.findById(id).orElse(null);
        return employeeRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User by Id" + id + "was not found"));

    }


    // Get ALL Employees
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }


}
