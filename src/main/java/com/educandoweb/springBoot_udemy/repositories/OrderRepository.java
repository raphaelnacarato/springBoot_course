package com.educandoweb.springBoot_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springBoot_udemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
