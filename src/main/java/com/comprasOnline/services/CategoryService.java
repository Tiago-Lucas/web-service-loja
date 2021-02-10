package com.comprasOnline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprasOnline.entities.Category;
import com.comprasOnline.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category> findAll(){
		return CategoryRepository.findAll();
	}
	
	public Category findById(Long id) {
	Optional<Category> obj	= CategoryRepository.findById(id);
	return obj.get();
	}
}
