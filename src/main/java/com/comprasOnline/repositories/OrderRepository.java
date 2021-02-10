package com.comprasOnline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprasOnline.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
		
}
