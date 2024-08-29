package com.felipeArgolo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeArgolo.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{}
