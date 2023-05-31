package com.example.spring_backend.services;

import com.example.spring_backend.entity.EmployeeEntity;
import com.example.spring_backend.model.Employee;
import com.example.spring_backend.repository.EmployeeRespository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRespository employeeRespository;

    public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRespository.save(employeeEntity);
        return employee;
    }
}
