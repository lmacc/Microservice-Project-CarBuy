package com.carbuy.repository;


import com.carbuy.domain.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long>{
	List<Car> findByCategory(String category);
	
	List<Car> findBySizeContaining(String size);
}
