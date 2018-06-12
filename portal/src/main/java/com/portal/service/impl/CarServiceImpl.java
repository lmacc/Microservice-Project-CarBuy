package com.portal.service.impl;

import com.portal.domain.Car;
import com.portal.repository.CarRepository;
import com.portal.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public Car save(Car car) {
		return carRepository.save(car);
	}
	
	public List<Car> findAll() {
		return (List<Car>) carRepository.findAll();
	}
	
	public Car findOne(Long id) {
		return carRepository.findOne(id);
	}
	
	public void removeOne(Long id) {
		carRepository.delete(id);
	}
}
