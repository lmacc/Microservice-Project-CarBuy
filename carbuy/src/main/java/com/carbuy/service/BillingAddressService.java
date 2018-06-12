package com.carbuy.service;

import com.carbuy.domain.BillingAddress;
import com.carbuy.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
