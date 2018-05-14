package com.yyc.hw.controller.department;

import com.yyc.hw.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DepartmentController {
    @Autowired
    private IDepartmentRepository departmentRepository;
    @GetMapping(value = "/department")
    public List<Department> getDepartList () {
        return departmentRepository.findAll();
    }
}
