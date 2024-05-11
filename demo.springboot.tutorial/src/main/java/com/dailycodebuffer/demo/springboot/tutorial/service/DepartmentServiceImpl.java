package com.dailycodebuffer.demo.springboot.tutorial.service;

import com.dailycodebuffer.demo.springboot.tutorial.entity.Department;
import com.dailycodebuffer.demo.springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }

    @Override
    public List<Department> fetchDepartmentsList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentsListById(long deptId) {
        return departmentRepository.findById(deptId).get();
    }

    @Override
    public String deleteDepartmentsListById(Long deptId) {
        departmentRepository.deleteById(deptId);
        return "the department with deptId=" + deptId + " is Deleted";
    }


    @Override
    public String updateDepartmentsListById(Long deptId, Department department) {
        Department departmentDB = departmentRepository.findById(deptId).get();

        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            departmentDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            departmentDB.setDepartmentCode(department.getDepartmentCode());
        }

        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            departmentDB.setDepartmentCode(department.getDepartmentName());
        }
        departmentRepository.save(departmentDB);

        return "the department with deptId=" + deptId + " is Updated";

    }
    @Override
    public Department findByDepartmentName(String name){
        return departmentRepository.findByDepartmentName(name);
    }
    @Override
    public Department findByDepartmentNameIgnoreCase(String name){
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }

}
