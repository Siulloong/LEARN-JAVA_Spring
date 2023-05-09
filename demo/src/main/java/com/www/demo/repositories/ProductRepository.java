package com.www.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.www.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
