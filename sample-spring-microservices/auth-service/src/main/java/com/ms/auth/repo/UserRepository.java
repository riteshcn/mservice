package com.ms.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}

