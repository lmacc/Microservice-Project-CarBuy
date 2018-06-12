package com.portal.service;

import com.portal.domain.Car;

import java.util.List;

public interface CarService {
	
	Car save(Car car);

	List<Car> findAll();
	
	Car findOne(Long id);
	
	void removeOne(Long id);
}
