package com.carbuy.service.impl;

import com.carbuy.domain.Car;
import com.carbuy.repository.CarRepository;
import com.carbuy.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarRepository carRepository;
	
	public List<Car> findAll() {
		List<Car> carList = (List<Car>) carRepository.findAll();
		List<Car> activeCarList = new ArrayList<>();
		
		for (Car car: carList) {
			if(car.isActive()) {
				activeCarList.add(car);
			}
		}
		
		return activeCarList;
	}
	
	public Car findOne(Long id) {
		return carRepository.findOne(id);
	}

	public List<Car> findByCategory(String category){
		List<Car> carList = carRepository.findByCategory(category);
		
		List<Car> activeCarList = new ArrayList<>();
		
		for (Car car: carList) {
			if(car.isActive()) {
				activeCarList.add(car);
			}
		}
		
		return activeCarList;
	}
	
	public List<Car> blurrySearch(String size) {
		List<Car> carList = carRepository.findBySizeContaining(size);
List<Car> activeCarList = new ArrayList<>();
		
		for (Car car: carList) {
			if(car.isActive()) {
				activeCarList.add(car);
			}
		}
		
		return activeCarList;
	}
}
