package com.educandoweb.springBoot_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springBoot_udemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
