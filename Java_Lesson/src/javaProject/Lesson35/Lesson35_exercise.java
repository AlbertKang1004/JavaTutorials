package javaProject.Lesson35;

import java.util.Arrays;

public class Lesson35_exercise {

	public static void main(String[] args) {
		int[][] a = { { 5, -16, 9, 21 }, { 22, 19, -101, 36 }, { 18, 17, 64, -2 } };
		System.out.println(a[1][2]);
		System.out.println(a.length);

		for (int i : a[2])
			System.out.print(i + " ");
		System.out.println();

		System.out.println(a[1][3]); // 36

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println("");
		}

		Arrays.sort(a[0]);
		System.out.println(Arrays.binarySearch(a[0], 5)); // 0

		System.out.println(Arrays.binarySearch(a[0], 0)); // -2

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = row * col;
			}
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println("");
		}

		// 0 0 0 0
		// 0 1 2 3
		// 0 2 4 6

		System.out.println();

		Arrays.fill(a[2], -156);
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println("");
		}

		// 0 0 0 0
		// 0 1 2 3
		// -156 -156 -156 -156

		double[][] d = new double[8][25];
		System.out.println(d[4][2]); // 0.0

		int[][] x = { { 1 } };
		int[][] y = { { 1 } };
		System.out.println(Arrays.equals(x, y)); // false

		int[][] g = { { 2, 6, 2, 7 }, { 3, 6, 16, 7 }, { 32, 6, 88, 1 } };
		Arrays.sort(g[2]);
		for (int row = 0; row < g.length; row++) {
			for (int col = 0; col < g[row].length; col++) {
				System.out.print(g[row][col] + "\t");
			}
			System.out.println("");
		}
	}

}
