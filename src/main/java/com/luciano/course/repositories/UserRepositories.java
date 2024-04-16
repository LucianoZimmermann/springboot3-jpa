package com.luciano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.course.entities.User;

public interface UserRepositories extends JpaRepository<User, Long>{

}
