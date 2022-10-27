package javaProject.Lesson06;

public class Lesson6_exercise {

	public static void main(String[] args) {
		double x = 24;
		double y = Math.sqrt(x);
		System.out.println(y); // √24

		int j = 3;
		int k = -44;
		int l = j *= Math.abs(k);
		System.out.println(l);

		int m = (int) Math.abs(-127.5);
		System.out.println(m);

		System.out.println(Math.pow(2, 1.5));

		System.out.println(Math.ceil(-157.2));		// -157.0
		System.out.println(Math.floor(-157.2));		// -158.0
		System.out.println(Math.ceil(157.2));		// 158.0
		System.out.println(Math.floor(157.2));		// 157.0
		System.out.println(Math.round(-157.2));		// -157.0
		System.out.println(Math.ceil(-157.7));		// -157.0
		System.out.println(Math.ceil(157)); 			// 157.0
		System.out.println(Math.ceil(157.7));		// 158.0
		
		System.out.println(Math.log(18));
		
		double p = 5.55;
		double result = p * Math.PI;
		System.out.println(result);
	}

}
