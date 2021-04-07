package tr.com.eyasun.factorypattern.withoutgeneric;

public class WithoutGenericDemo {

	public static void main(final String[] args) {
		Circle circle = new Circle(30.0);
		IAreaCalculatorFactory areaCalculatorFactory = new DefaultAreaCalculatorFactory();
		IAreaCalculator calculator = areaCalculatorFactory.getCalculator(circle.getClass());
		System.out.println(calculator.calculate(circle));

		Rectangle rectangle = new Rectangle(10.0, 20.0);
		/*
		 * Without generic program gets type cast exception. Exception in thread "main
		 * java.lang.ClassCastException:
		 * tr.com.eyasun.factorypattern.withoutgeneric.Rectangle cannot be cast to
		 * tr.com.eyasun.factorypattern.withoutgeneric.Circle at
		 * tr.com.eyasun.factorypattern.withoutgeneric.CircleAreaCalculator.calculate(
		 * CircleAreaCalculator.java:7) at
		 * tr.com.eyasun.factorypattern.withoutgeneric.WithoutGenericDemo.main(
		 * WithoutGenericDemo.java:12)
		 */
		System.out.println(calculator.calculate(rectangle));

	}

}
