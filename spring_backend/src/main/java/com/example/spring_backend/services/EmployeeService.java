package com.example.spring_backend.services;

import com.example.spring_backend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee editEmployee(Long id, Employee employee);
}
