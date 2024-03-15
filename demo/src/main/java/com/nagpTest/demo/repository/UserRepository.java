package com.nagpTest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagpTest.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
