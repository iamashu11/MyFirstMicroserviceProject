package com.conti.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conti.User.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserId(int deptId);

}
