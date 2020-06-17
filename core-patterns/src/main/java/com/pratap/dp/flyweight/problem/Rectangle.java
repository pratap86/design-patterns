package com.pratap.dp.flyweight.problem;

public class Rectangle implements Shape {

	private String label;
	private int length;
	private int breadth;
	private String fillstyle;

	public Rectangle() {
		this.label = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + label + " with length " + length + " Breadth " + breadth + " and fill style "
				+ fillstyle);
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void setFillstyle(String fillstyle) {
		this.fillstyle = fillstyle;
	}

}
