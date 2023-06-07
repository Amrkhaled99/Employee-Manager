package com.myApp.employeemanager.repo;

import com.myApp.employeemanager.model.Department;
import com.myApp.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
