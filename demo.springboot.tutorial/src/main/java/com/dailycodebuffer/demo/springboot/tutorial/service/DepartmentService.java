package com.dailycodebuffer.demo.springboot.tutorial.service;

import com.dailycodebuffer.demo.springboot.tutorial.entity.Department;
import java.util.List;

public interface DepartmentService {
    public  Department saveDepartment(Department department);
    public List<Department> fetchDepartmentsList();

    public  Department fetchDepartmentsListById(long deptId);

    public String deleteDepartmentsListById(Long deptId);
    public String updateDepartmentsListById(Long deptId,Department department);
    public Department findByDepartmentName(String name);
    public Department findByDepartmentNameIgnoreCase(String name);



    }
