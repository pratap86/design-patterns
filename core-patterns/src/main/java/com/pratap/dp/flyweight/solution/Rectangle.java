package com.pratap.dp.flyweight.solution;

public class Rectangle extends Shape {

	private String label;

	public Rectangle() {
		this.label = "Rectangle";
	}

	@Override
	public void draw(int length, int breadth, String fillstyle) {
		System.out.println("Drawing a " + label + " with length " + length + " Breadth " + breadth + " and fill style "
				+ fillstyle);
	}

}
