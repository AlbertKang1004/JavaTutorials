package javaProject.Lesson30;

import java.util.*;

public class Lesson30_project {

	public static void main(String[] args) {
		Random rn = new Random();
		int r = 0, count = 0;

		for (int j = 0; j < 33; j++) {
			r = 71 + rn.nextInt(20);
			System.out.print(r + " ");
			count++;
			if (count > 15) {
				System.out.println();
				count = 0;
			}
		}

		System.out.println();
		System.out.println();

		double r2 = 0;
		count = 0;
		for (int j = 0; j < 27; j++) {
			r2 = 99.78 + 47.44 * rn.nextDouble();
			System.out.print(r2 + " ");
			count++;
			if (count > 2) {
				System.out.println();
				count = 0;
			}
		}

	}

}
