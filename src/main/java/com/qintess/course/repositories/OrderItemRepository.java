package com.qintess.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.course.entidades.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
