package tr.com.eyasun.factorypattern.withoutgeneric;

public class Circle implements IShape {
	private double radius;

	public Circle(final double aRadius) {
		super();
		this.radius = aRadius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(final double aRadius) {
		this.radius = aRadius;
	}

}
