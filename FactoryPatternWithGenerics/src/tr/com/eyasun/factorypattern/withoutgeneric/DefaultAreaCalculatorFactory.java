package tr.com.eyasun.factorypattern.withoutgeneric;

import java.util.HashMap;
import java.util.Map;

public class DefaultAreaCalculatorFactory implements IAreaCalculatorFactory {

	private Map<Class<?>, IAreaCalculator> calculators;
	{
		this.calculators = new HashMap<>();
		this.calculators.put(Circle.class, new CircleAreaCalculator());
		this.calculators.put(Triangle.class, new TriangleAreaCalculator());
		this.calculators.put(Rectangle.class, new RectangleAreaCalculator());
	}

	@Override
	public void addCalculator(final Class<?> aShapeClass, final IAreaCalculator aAreaCalculator) {
		this.calculators.put(aShapeClass, aAreaCalculator);
	}

	@Override
	public IAreaCalculator getCalculator(final Class<?> aShapeClass) {
		return this.calculators.get(aShapeClass);
	}

	@Override
	public void removeCalculator(final Class<?> aShapeClass) {
		this.calculators.remove(aShapeClass);
	}

}
