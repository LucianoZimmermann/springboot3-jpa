package com.luciano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.course.entities.Order;

public interface OrderRepositories extends JpaRepository<Order, Long>{

}
