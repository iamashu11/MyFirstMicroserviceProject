package com.conti.User.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conti.User.VO.ResponseTemplateVO;
import com.conti.User.entity.User;
import com.conti.User.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveDepartment(@RequestBody User dept) {
		return userService.saveDepartment(dept);	
	}
	
	@GetMapping("/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") int userId) {
		return userService.getUserWithDepartment(userId);
	}
	
//	@GetMapping("/{userId}")
//	public User findByDepartmentId(@PathVariable("userId") int userId) {
//		return userService.findByUserId(userId);
//	}

}
