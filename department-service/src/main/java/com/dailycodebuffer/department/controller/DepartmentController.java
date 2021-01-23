package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside save method of DepartmentController");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDeparmentById Method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
