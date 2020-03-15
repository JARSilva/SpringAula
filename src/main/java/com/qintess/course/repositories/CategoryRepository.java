package com.qintess.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.course.entidades.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
