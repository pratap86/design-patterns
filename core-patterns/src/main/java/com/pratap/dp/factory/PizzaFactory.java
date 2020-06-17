package com.pratap.dp.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		} else if (type.equals("chicken")) {
			pizza = new ChickenPizza();
		}
		return pizza;
	}
}
