package tr.com.eyasun.factorypattern.withoutgeneric;

public class Triangle implements IShape {
	private double a;
	private double b;
	private double c;

	public Triangle(final double aA, final double aB, final double aC) {
		super();
		this.a = aA;
		this.b = aB;
		this.c = aC;
	}

	public double getA() {
		return this.a;
	}

	public void setA(final double aA) {
		this.a = aA;
	}

	public double getB() {
		return this.b;
	}

	public void setB(final double aB) {
		this.b = aB;
	}

	public double getC() {
		return this.c;
	}

	public void setC(final double aC) {
		this.c = aC;
	}

}
