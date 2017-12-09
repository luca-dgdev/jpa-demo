package com.dgdev.luca.demojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgdev.luca.demojpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
