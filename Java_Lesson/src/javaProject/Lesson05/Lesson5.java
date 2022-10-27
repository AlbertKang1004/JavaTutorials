package javaProject.Lesson05;

public class Lesson5 {

	public static void main(String[] args) {
		double d = 29.78;
		int i = (int) d;
		System.out.println(i);

		int j = 105;
		double k = j;
		System.out.println(k);

		System.out.println((int) (3.0 + 4) / (1 + 4.0) * 2 - 3);

		final double PI = 3.14159; // UNCHANGABLE
		System.out.println(PI);

		d += j;
		System.out.println(d);
	}

}
