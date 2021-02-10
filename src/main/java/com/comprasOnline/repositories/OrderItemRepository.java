package com.comprasOnline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprasOnline.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
		
}
