package com.example.employees.repository;

import com.example.employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT a.empId FROM employee WHERE a.lastName := lastName")
    public List<Employee> getListOfEmployeeByLastName(@Param("lastName") String lastName);
}
