package com.pratap.dp.flyweight.solution;
/**
 * it would allow to client draw multiple shape objects like circle or rectangle.
 * @author Pratap Narayan
 * @since June 13, 2020
 *
 */
public abstract class Shape {

	/**
	 * For Circle
	 * @param radius
	 * @param fillcolor
	 * @param linecolor
	 */
	void draw(int radius, String fillcolor, String linecolor) {
		// no - operation
	}
	
	void draw(int length, int breadth, String fillstyle) {
		// no operation
	}
}
