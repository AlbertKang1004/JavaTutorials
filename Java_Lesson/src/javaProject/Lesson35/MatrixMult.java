package javaProject.Lesson35;

public class MatrixMult {

	public MatrixMult() {
		// CONSTRUCTOR
	}

	public static int[][] mult(int[][] a, int[][] b) {
		int row = a.length;
		int col = b[0].length;
		int[][] result = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int sum = 0;

				for (int k = 0; k < a[0].length; k++) {

					sum += (a[i][k] * b[k][j]);

				}
				result[i][j] = sum;
			}
		}

		return result;
	}

}
