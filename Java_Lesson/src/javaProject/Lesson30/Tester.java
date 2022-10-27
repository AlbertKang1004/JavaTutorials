package javaProject.Lesson30;

public class Tester {

	public static void main(String[] args) {
		MonteCarlo mcObj = new MonteCarlo(5, 3, 2);
		double x, y;
		double sqrCount = 0, cirCount = 0;
		for (int i = 0; i <= 100000; i++) {
			x = mcObj.nextRainDrop_x();
			y = mcObj.nextRainDrop_y();
			sqrCount++;
			if (mcObj.insideCircle(x, y)) {
				cirCount++;
			}
		}
		
		System.out.println("Estimated π = " + 4 * (cirCount / sqrCount));

	}

}
