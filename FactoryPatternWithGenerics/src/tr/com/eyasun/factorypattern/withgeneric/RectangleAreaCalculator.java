package tr.com.eyasun.factorypattern.withgeneric;

public class RectangleAreaCalculator implements IAreaCalculator<Rectangle> {

	@Override
	public double calculate(final Rectangle aShape) {
		return aShape.getWidth() * aShape.getLength();
	}

}
