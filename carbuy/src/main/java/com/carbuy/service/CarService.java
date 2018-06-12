package com.carbuy.service;

import com.carbuy.domain.Car;

import java.util.List;

public interface CarService {
	List<Car> findAll();
	
	Car findOne(Long id);
	
	List<Car> findByCategory(String category);
	
	List<Car> blurrySearch(String title);
}
