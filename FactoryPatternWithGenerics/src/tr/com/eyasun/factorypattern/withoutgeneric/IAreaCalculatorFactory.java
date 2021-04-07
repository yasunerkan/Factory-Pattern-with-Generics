package tr.com.eyasun.factorypattern.withoutgeneric;

public interface IAreaCalculatorFactory {
	void addCalculator(Class<?> aShapeClass, IAreaCalculator aAreaCalculator);

	IAreaCalculator getCalculator(Class<?> aShapeClass);

	void removeCalculator(Class<?> aShapeClass);

}
