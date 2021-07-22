package com.educandoweb.springBoot_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springBoot_udemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
