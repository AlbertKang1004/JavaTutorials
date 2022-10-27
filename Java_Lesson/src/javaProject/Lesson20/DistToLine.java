package javaProject.Lesson20;

import static java.lang.Math.*;

public class DistToLine {
	
	public DistToLine() {}
	static double A, B, C;

	static double getDist(double a, double b) {
		double dist = abs(A * a + B * b + C) / sqrt(pow(a, 2) + pow(b, 2));
		return dist;
	}

}
