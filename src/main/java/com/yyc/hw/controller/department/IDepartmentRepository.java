package com.yyc.hw.controller.department;

import com.yyc.hw.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
}
