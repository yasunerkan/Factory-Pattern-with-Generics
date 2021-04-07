package tr.com.eyasun.factorypattern.withgeneric;

import java.util.HashMap;
import java.util.Map;

public class DefaultAreaCalculatorFactory implements IAreaCalculatorFactory {

	private Map<Class<?>, IAreaCalculator<?>> calculators;
	{
		this.calculators = new HashMap<>();
		this.calculators.put(Circle.class, new CircleAreaCalculator());
		this.calculators.put(Triangle.class, new TriangleAreaCalculator());
		this.calculators.put(Rectangle.class, new RectangleAreaCalculator());
	}

	@Override
	public <T> void addCalculator(final Class<? extends T> aShapeClass, final IAreaCalculator<T> aAreaCalculator) {
		this.calculators.put(aShapeClass, aAreaCalculator);
	}

	@Override
	public <T> IAreaCalculator<T> getCalculator(final Class<? extends T> aShapeClass) {
		return (IAreaCalculator<T>) this.calculators.get(aShapeClass);
	}

	@Override
	public void removeCalculator(final Class<?> aShapeClass) {
		this.calculators.remove(aShapeClass);
	}

}
