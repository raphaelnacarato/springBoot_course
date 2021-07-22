package com.educandoweb.springBoot_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springBoot_udemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
