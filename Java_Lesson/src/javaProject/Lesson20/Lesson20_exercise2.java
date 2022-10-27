package javaProject.Lesson20;

import static java.lang.Math.*;

public class Lesson20_exercise2 {

	static public char ch = 'K';
	public static double zxb;
	public static String sn = "";

	public static void main(String[] args) {
		double x = 12.2, zv = 3.3;
		double xop = pow(sqrt(x - zv), 3.1);
		System.out.println(xop);
		
		// using keyword static:
		// 1. Accessible without creating an object
		// 2. Make it shared within all variables.
	}

}
