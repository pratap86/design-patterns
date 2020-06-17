package com.pratap.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CustomerImpl implements Customer {

	@Autowired
	CreditCard creditCard;
	
	@Override
	public void pay() {
		creditCard.makePayment();
	}

}
