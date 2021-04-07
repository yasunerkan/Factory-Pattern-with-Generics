package tr.com.eyasun.factorypattern.withgeneric;

public class CircleAreaCalculator implements IAreaCalculator<Circle> {

	@Override
	public double calculate(final Circle aShape) {
		return Math.PI * 2 * aShape.getRadius();
	}

}
