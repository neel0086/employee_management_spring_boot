package com.example.spring_backend.repository;

import com.example.spring_backend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<EmployeeEntity,Long> {
}
