package com.myApp.employeemanager.controller;

import com.myApp.employeemanager.model.Department;
import com.myApp.employeemanager.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentResource {
    private final DepartmentService DepartmentService;

    public DepartmentResource(DepartmentService DepartmentService) {
        this.DepartmentService = DepartmentService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> Departments = DepartmentService.findAllDepartments();
        return new ResponseEntity<>(Departments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") long id) {
        Department Department = DepartmentService.findDepartmentById(id);
        return new ResponseEntity<>(Department, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Department> addDepartment(@RequestBody Department Department) {
        Department _Department = DepartmentService.addDepartment(Department);
        return new ResponseEntity<>(_Department, HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Department> editDepartment(@RequestBody Department Department) {
        Department _Department = DepartmentService.editDepartment(Department);
        return new ResponseEntity<>(_Department, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable("id") long id) {
        DepartmentService.deleteDepartment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
