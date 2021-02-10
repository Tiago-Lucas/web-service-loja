package com.comprasOnline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprasOnline.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
}
