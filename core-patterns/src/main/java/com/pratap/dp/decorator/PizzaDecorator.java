package com.pratap.dp.decorator;
/**
 * A base decorator
 * @author Pratap Narayan
 *
 */
public class PizzaDecorator implements Pizza {

	private Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void bake() {
		pizza.bake();
	}

}
