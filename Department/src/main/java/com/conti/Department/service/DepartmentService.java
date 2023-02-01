package com.conti.Department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conti.Department.entity.Department;
import com.conti.Department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository deptRepo;

	public Department saveDepartment(Department dept) {
		return deptRepo.save(dept);
	}

	public Department findByDepartmentId(int deptId) {
		return deptRepo.findByDepartmentId(deptId);
	}

}
