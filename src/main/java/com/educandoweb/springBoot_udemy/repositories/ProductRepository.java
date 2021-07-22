package com.educandoweb.springBoot_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springBoot_udemy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
