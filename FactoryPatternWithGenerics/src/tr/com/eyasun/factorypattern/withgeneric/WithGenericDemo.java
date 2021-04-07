package tr.com.eyasun.factorypattern.withgeneric;

public class WithGenericDemo {

	public static void main(final String[] args) {
		Circle circle = new Circle(30.0);
		IAreaCalculatorFactory areaCalculatorFactory = new DefaultAreaCalculatorFactory();
		IAreaCalculator<Circle> calculator = areaCalculatorFactory.getCalculator(circle.getClass());
		System.out.println(calculator.calculate(circle));

		Rectangle rectangle = new Rectangle(10.0, 20.0);
		/*
		 * Generics prevent runtime type casting errors
		 */
		System.out.println(calculator.calculate(rectangle));

	}

}
