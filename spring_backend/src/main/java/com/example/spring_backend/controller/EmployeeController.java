package com.example.spring_backend.controller;

import com.example.spring_backend.entity.EmployeeEntity;
import com.example.spring_backend.model.Employee;
import com.example.spring_backend.services.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1")
@CrossOrigin
@RestController
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){

        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> editEmployee(@PathVariable Long id ,@RequestBody Employee employee){
        employee=employeeService.editEmployee(id,employee);
        return ResponseEntity.ok(employee);
    }


}
