package com.dailycodebuffer.demo.springboot.tutorial.repository;

import com.dailycodebuffer.demo.springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public Department findByDepartmentName (String name);
    public Department findByDepartmentNameIgnoreCase(String name);

}
