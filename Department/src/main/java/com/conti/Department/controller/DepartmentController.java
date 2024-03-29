package com.conti.Department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conti.Department.entity.Department;
import com.conti.Department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department dept) {
		//log.info("Inside saveDepartment method of department controller");
		return deptService.saveDepartment(dept);	
	}
	
	@GetMapping("/{deptId}")
	public Department findByDepartmentId(@PathVariable("deptId") int deptId) {
		return deptService.findByDepartmentId(deptId);
	}
}
