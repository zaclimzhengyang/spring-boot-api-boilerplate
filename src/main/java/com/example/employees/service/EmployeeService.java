package com.example.employees.service;

import com.example.employees.model.Employee;
import com.example.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployeeById(Long empId) {
        employeeRepository.deleteById(empId);
    }

    public List<Employee> getEmployees(String lastName) {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Long empId, Employee employeeDetails) {
        Employee emp = employeeRepository.findById(empId).get();
        emp.setFirstName(employeeDetails.getFirstName());
        emp.setLastName(employeeDetails.getLastName());
        emp.setEmailId(employeeDetails.getEmailId());

        return employeeRepository.save(emp);
    }
}
