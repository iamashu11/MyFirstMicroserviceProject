package com.conti.User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.conti.User.VO.Department;
import com.conti.User.VO.ResponseTemplateVO;
import com.conti.User.entity.User;
import com.conti.User.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveDepartment(User dept) {
		return userRepo.save(dept);
	}

	public User findByUserId(int userId) {
		return userRepo.findByUserId(userId);
	}

	public ResponseTemplateVO getUserWithDepartment(int userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepo.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" +user.getDepartmentId(), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
