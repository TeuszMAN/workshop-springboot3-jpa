package com.teusz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teusz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
