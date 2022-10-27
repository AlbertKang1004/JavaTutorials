package javaProject.Lesson35;

public class Lesson35_problem {

	public static void main(String[] args) {
		int[][] zorro = new int[3][4];
		for (int row = 0; row < zorro.length; row++) {
			for (int col = 0; col < zorro[row].length; col++) {
				zorro[row][col] = col + 1;
			}
		}
		print(zorro);

		int mat[][] = { { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 0, 1, 2, 3 } };
		for (int p = 0; p < mat.length; p++)
			for (int q = 0; q < mat[p].length; q++)
				--mat[p][q];
		print(mat);

		int[][] intArray = { { 11, 2 }, { 20, 30 }, { 7, 9 }, { 0, 1 } };
		System.out.println(intArray.length); // 4
		System.out.println(intArray[2].length); // 2

		int frst[][] = { { -1, 0, 1 }, { 5, 6, 7 }, { 2, 3, 4 } };
		int len = frst.length;
		int sec[][] = new int[len][];
		for (int j = 0; j < len; j++)
			sec[j] = frst[len - j - 1];
		frst = sec;
		print(frst);
	}

	public static void print(int[][] g) {
		for (int row = 0; row < g.length; row++) {
			for (int col = 0; col < g[row].length; col++) {
				System.out.print(g[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
