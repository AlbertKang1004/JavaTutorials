package javaProject.Lesson36;

public class Triangle {
	public Triangle() {
		this(2, 5);
	}

	public Triangle(int bs, int alt) {
		base = bs;
		altitude = alt;
	}

	public double area() {
		return .5 * base * altitude;

	}

	private int base;
	private int altitude;
}
