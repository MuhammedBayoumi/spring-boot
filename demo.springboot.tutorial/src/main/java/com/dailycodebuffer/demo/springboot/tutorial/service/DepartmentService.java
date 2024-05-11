package com.dailycodebuffer.demo.springboot.tutorial.service;

import com.dailycodebuffer.demo.springboot.tutorial.entity.Department;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public  Department saveDepartment(Department department);
    public List<Department> fetchDepartmentsList();

    public  Department fetchDepartmentsListById(long deptId);

    public String deleteDepartmentsListById(Long deptId);
    public String updateDepartmentsListById(Long deptId,Department department);
    public Department findByDepartmentName(String name);
    public Department findByDepartmentNameIgnoreCase(String name);



    }
