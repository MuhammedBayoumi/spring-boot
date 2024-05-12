package com.dailycodebuffer.demo.springboot.tutorial.controller;

import com.dailycodebuffer.demo.springboot.tutorial.entity.Department;
import com.dailycodebuffer.demo.springboot.tutorial.service.DepartmentService;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER  = LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping(value = "/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment");
        return departmentService.saveDepartment(department);
    }

    @GetMapping(value = "/AllDepartments")
    public List<Department> fetchDepartmentsList() {
        return departmentService.fetchDepartmentsList();
    }

    @GetMapping(value = "/fetchDepartmentsListById/{id}")
    public Department fetchDepartmentsListById(@PathVariable("id") Long deptId) {
        return departmentService.fetchDepartmentsListById(deptId);
    }

    @DeleteMapping(value = "/deleteDepartmentsListById/{id}")
    public String deleteDepartmentsListById(@PathVariable("id") Long deptId) {
        return departmentService.deleteDepartmentsListById(deptId);
    }

    @PutMapping(value = "/updateDepartmentsListById/{id}")
    public String updateDepartmentsListById(@PathVariable("id") Long deptId, @RequestBody Department department) {
        return departmentService.updateDepartmentsListById(deptId, department);

    }

    @GetMapping(value = "/findByDepartmentByName/name/{deptName}")
    public Department findByDepartmentByName(@PathVariable("deptName") String deptName) {
        return departmentService.findByDepartmentName(deptName);
    }

    @GetMapping(value = "/findByDepartmentNameIgnoreCase/name/{deptName}")
    public Department findByDepartmentNameIgnoreCase(@PathVariable("deptName") String deptName) {
        return departmentService.findByDepartmentNameIgnoreCase(deptName);
    }
}
