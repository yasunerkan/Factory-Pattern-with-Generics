package tr.com.eyasun.factorypattern.withgeneric;

public class Rectangle implements IShape {
	private double length;
	private double width;

	public Rectangle(final double aLength, final double aWidth) {
		super();
		this.length = aLength;
		this.width = aWidth;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(final double aLength) {
		this.length = aLength;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(final double aWidth) {
		this.width = aWidth;
	}

}
