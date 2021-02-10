package com.comprasOnline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprasOnline.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
		
}
