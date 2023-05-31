package com.example.spring_backend.services;

import com.example.spring_backend.entity.EmployeeEntity;
import com.example.spring_backend.model.Employee;
import com.example.spring_backend.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<Employee> employees = employeeEntities
                .stream()
                .map(emp -> new Employee(
                        emp.getId(),
                        emp.getFname(),
                        emp.getLname(),
                        emp.getEmailId()))
                .collect(Collectors.toList());
        return employees;
    }

    @Override
    public Employee editEmployee(Long id, Employee employee) {
        EmployeeEntity employeeEntity
                = employeeRepository.findById(id).get();
        employeeEntity.setEmailId(employee.getEmailId());
        employeeEntity.setFname(employee.getFname());
        employeeEntity.setLname(employee.getLname());

        employeeRepository.save(employeeEntity);
        return employee;
    }
}
