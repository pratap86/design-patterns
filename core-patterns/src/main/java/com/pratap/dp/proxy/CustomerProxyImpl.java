package com.pratap.dp.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

	CustomerImpl customer = new CustomerImpl();
	
	@Override
	public int getId() {
		return customer.getId();
	}

	@Override
	public List<Order> getOrders() {

		List<Order> orders = new ArrayList<>();
		Order order1 = new Order();
		order1.setId(0011);
		order1.setProductName("MacBook Pro");
		order1.setQuantity(1);
		orders.add(order1);
		
		Order order2 = new Order();
		order2.setId(0012);
		order2.setProductName("IPhone 11 Pro");
		order2.setQuantity(1);
		orders.add(order2);
		
		return orders;
	}

}
