package tr.com.eyasun.factorypattern.withgeneric;

public interface IAreaCalculator<T> {

	double calculate(T aShape);

}
