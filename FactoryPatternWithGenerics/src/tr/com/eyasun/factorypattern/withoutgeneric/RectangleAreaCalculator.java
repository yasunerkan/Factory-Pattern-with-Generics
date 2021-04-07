package tr.com.eyasun.factorypattern.withoutgeneric;

public class RectangleAreaCalculator implements IAreaCalculator {

	@Override
	public double calculate(final IShape aShape) {
		Rectangle rectangle = (Rectangle) aShape;
		return rectangle.getWidth() * rectangle.getLength();
	}

}
