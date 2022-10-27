package javaProject.Lesson30;

import java.util.Random;

public class MonteCarlo {

	public MonteCarlo(double h, double k, double r) {
		this.h = h; // x-coordinate of the centre of the circle
		this.k = k; // y-coordinate of the centre of the circle
		this.r = r;
	}

	public double nextRainDrop_x() {
		return (h - r) + (2 * r * rn.nextDouble());
	}

	public double nextRainDrop_y() {
		return (k - r) + (2 * r * rn.nextDouble());
	}

	public boolean insideCircle(double x, double y) {
		if (Math.pow(x - h, 2) + Math.pow(y - k, 2) <= Math.pow(r, 2)) {
			return true;
		}
		return false;
	}

	public double h, k, r;
	private Random rn = new Random();

}
