package com.qintess.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.course.entidades.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
