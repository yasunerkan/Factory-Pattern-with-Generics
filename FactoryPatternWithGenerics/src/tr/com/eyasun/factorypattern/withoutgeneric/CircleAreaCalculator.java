package tr.com.eyasun.factorypattern.withoutgeneric;

public class CircleAreaCalculator implements IAreaCalculator {

	@Override
	public double calculate(final IShape aShape) {
		Circle circle = (Circle) aShape;
		return Math.PI * 2 * circle.getRadius();
	}

}
