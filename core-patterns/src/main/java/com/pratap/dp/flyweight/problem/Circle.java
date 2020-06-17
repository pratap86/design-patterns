package com.pratap.dp.flyweight.problem;

public class Circle implements Shape {

	private String label;
	private int radius;
	private String fillcolor;
	private String linecolor;

	public Circle() {
		this.label = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + label + " with radius " + radius + " Fill color " + fillcolor
				+ " and line color " + linecolor);
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

}
