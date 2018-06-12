package com.carbuy.service;

import com.carbuy.domain.ShippingAddress;
import com.carbuy.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
