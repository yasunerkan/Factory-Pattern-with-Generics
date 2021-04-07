package tr.com.eyasun.factorypattern.withgeneric;

public interface IAreaCalculatorFactory {
	<T> void addCalculator(Class<? extends T> aShapeClass, IAreaCalculator<T> aAreaCalculator);

	<T> IAreaCalculator<T> getCalculator(Class<? extends T> aShapeClass);

	void removeCalculator(Class<?> aShapeClass);

}
