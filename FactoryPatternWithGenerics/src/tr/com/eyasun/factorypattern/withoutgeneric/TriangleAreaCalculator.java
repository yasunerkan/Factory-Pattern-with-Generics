package tr.com.eyasun.factorypattern.withoutgeneric;

public class TriangleAreaCalculator implements IAreaCalculator {

	@Override
	public double calculate(final IShape aShape) {
		Triangle triangle = (Triangle) aShape;
		double s = (triangle.getA() + triangle.getB() + triangle.getC()) / 2.0;
		return Math.sqrt(s * (s - triangle.getA()) * (s - triangle.getB()) * (s - triangle.getC()));
	}

}
