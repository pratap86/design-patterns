package com.pratap.dp.decorator;
/**
 * A concrete decorator
 * @author Pratap Narayan
 *
 */
public class VeggiePizzaDecorator extends PizzaDecorator {

	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void bake() {
		super.bake();
		addVeggieTopping();
	}

	private void addVeggieTopping() {
		System.out.println("Adding veggie toppings");
	}
	

}
