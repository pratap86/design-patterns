package com.pratap.dp.decorator;
/**
 * A concrete decorator
 * @author Pratap Narayan
 *
 */
public class CheesePizzaDecorator extends PizzaDecorator {

	public CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void bake() {
		super.bake();
		addCheeseTopping();
	}

	private void addCheeseTopping() {
		System.out.println("Adding cheese toppings");
	}
	

}
