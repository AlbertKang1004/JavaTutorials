package javaProject.Lesson20;

public class Tester {
	public static void main(String[] args) {
		double yz = methodF(); // have to be static
		double ab = yz;
		System.out.println(ab);
	}

	public static double methodF() {
		return 0.0;
	}
	
	public void ex() {
		double x = methodF(); // non-static methods can address static methods
		System.out.println(x);
	}

	public static double sv = 99;
}
