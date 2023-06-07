package com.myApp.employeemanager.service;

import com.myApp.employeemanager.exception.UserNotFoundException;
import com.myApp.employeemanager.model.Department;
import com.myApp.employeemanager.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private final DepartmentRepo departmentRepo;


    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }


    // Add Department
    public Department editDepartment(Department Department) {
        return departmentRepo.save(Department);
    }

    // Update Department
    public Department addDepartment(Department Department) {
        return departmentRepo.save(Department);
    }

    // Delete Department
    public void deleteDepartment(Long id) {
        departmentRepo.deleteById(id);
    }

    // Get ALL Departments
    public Department findDepartmentById(Long id) {
//        return departmentRepo.findById(id).orElse(null);
        return departmentRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User by Id" + id + "was not found"));

    }


    // Get ALL Departments
    public List<Department> findAllDepartments() {
        return departmentRepo.findAll();
    }


}
