package entities;

import entities.enums.ColorShape;

public final class ShapeCircle extends Shape {

	private Double radius;
	
	public ShapeCircle() {
		super();
	}

	public ShapeCircle(ColorShape color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return Math.PI * radius * radius;
	}
}
