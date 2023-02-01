package com.conti.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conti.Department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	Department findByDepartmentId(int deptId);

}
