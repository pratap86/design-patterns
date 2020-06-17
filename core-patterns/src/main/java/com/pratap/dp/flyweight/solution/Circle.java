package com.pratap.dp.flyweight.solution;

public class Circle extends Shape {

	private String label;
	
	public Circle() {
		this.label = "Circle";
	}

	@Override
	public void draw(int radius, String fillcolor, String linecolor) {
		System.out.println("Drawing a " + label + " with radius " + radius + " Fill color " + fillcolor
				+ " and line color " + linecolor);
	}

}
