package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;

import java.util.Optional;

public interface DepartmentService {
    public Department save(Department department);

    Optional<Department> findDepartmentById(Long departmentId);
}
