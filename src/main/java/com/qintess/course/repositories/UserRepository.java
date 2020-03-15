package com.qintess.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.course.entidades.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
