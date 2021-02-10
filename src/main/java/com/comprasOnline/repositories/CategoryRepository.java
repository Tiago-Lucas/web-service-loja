package com.comprasOnline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprasOnline.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}
