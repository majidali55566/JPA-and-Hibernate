package com.majid.JPA.practice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.majid.JPA.practice.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
