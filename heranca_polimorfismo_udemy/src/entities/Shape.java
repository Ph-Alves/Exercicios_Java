package entities;

import entities.enums.ColorShape;

public abstract class Shape {
	
	protected ColorShape color;
	
	public Shape() {
	}
	
	public Shape(ColorShape color) {
		this.color = color;
	}

	public ColorShape getColor() {
		return color;
	}

	public void setColor(ColorShape color) {
		this.color = color;
	}
	
	public abstract Double area();
}
