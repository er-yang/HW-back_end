package com.yyc.hw.controller.department;

import com.yyc.hw.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(value = "/department/save")
    public Department save (@RequestBody Department department) {
        return departmentRepository.save(department);
    }
    @GetMapping(value = "/department/delete/{id}")
    public boolean  deleteCamera(@PathVariable("id") Integer id){
        try {
            departmentRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
