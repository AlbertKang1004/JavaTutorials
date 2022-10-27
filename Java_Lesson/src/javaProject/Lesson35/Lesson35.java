package javaProject.Lesson35;

import java.util.Arrays;

public class Lesson35 {

	@SuppressWarnings("unused")

	public static void main(String[] args) {
		int[][] a = new int[3][2]; // 3 rows, 2 columns
		a[0][0] = 22;
		a[0][1] = 23;
		a[1][0] = 24;
		a[1][1] = 25;
		a[2][0] = 26;
		a[2][1] = 27;

		int[][] b = { { 22, 23 }, { 24, 25 }, { 26, 27 } };
		// different type of initialization

		int[][] c = new int[][] { { 22, 23 }, { 24, 25 }, { 26, 27 } };
		System.out.println(a[0].length); // number of columns in row 0
		
		int[][] d = new int[3][]; // unspecified number of columns
		d[0] = new int[4];
		d[1] = new int[2];
		d[2] = new int[3];
		
		System.out.println(Arrays.equals(a[0], b[1])); // can compare between rows
		Arrays.sort(a[0]);
		System.out.println(Arrays.binarySearch(a[0], 22));
		Arrays.fill(a[0], 23);
	}

}
