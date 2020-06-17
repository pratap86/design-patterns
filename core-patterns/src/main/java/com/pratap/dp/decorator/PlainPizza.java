package com.pratap.dp.decorator;
/**
 * A concrete component, starting point for a Pizza creation
 * @author Pratap Narayan
 *
 */
public class PlainPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Baking plain pizza");
	}

}
