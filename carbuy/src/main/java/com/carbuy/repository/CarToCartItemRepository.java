package com.carbuy.repository;

import com.carbuy.domain.CarToCartItem;
import com.carbuy.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CarToCartItemRepository extends CrudRepository<CarToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
