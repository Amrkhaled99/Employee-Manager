package com.myApp.employeemanager.repo;

import com.myApp.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

//
//    @Query(value = "select * from hr_employees emp where emp.name like:empName")
//    List<Employee> filter(@Param("empName")String name);
//

}
