package com.carbuy.service;

import com.carbuy.domain.Payment;
import com.carbuy.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
