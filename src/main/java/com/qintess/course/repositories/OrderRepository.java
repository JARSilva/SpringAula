package com.qintess.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.course.entidades.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
