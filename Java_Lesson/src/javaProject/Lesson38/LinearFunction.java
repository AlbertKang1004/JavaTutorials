package javaProject.Lesson38;

public class LinearFunction implements LinearFunctionMethods {

	public LinearFunction(double m, double b) {
		this.m = m;
		this.b = b;
	}

	@Override
	public double getSlope() {
		return m;
	}

	@Override
	public double getYintercept() {
		return b;
	}

	@Override
	public double getRoot() {
		return -b / m;
	}

	@Override
	public double getYvalue(double x) {

		return m * x + b;
	}

	@Override
	public double getXvalue(double y) {
		return (y - b) / m;
	}

	public double m, b;

}
