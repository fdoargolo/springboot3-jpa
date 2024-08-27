package com.felipeArgolo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeArgolo.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{}
