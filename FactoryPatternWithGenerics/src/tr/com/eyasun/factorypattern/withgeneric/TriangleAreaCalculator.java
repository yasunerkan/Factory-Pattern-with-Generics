package tr.com.eyasun.factorypattern.withgeneric;

public class TriangleAreaCalculator implements IAreaCalculator<Triangle> {

	@Override
	public double calculate(final Triangle aShape) {
		double s = (aShape.getA() + aShape.getB() + aShape.getC()) / 2.0;
		return Math.sqrt(s * (s - aShape.getA()) * (s - aShape.getB()) * (s - aShape.getC()));
	}

}
