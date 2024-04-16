package com.luciano.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciano.course.entities.Order;
import com.luciano.course.repositories.OrderRepositories;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepositories repository;

	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
