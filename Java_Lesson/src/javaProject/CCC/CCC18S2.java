package javaProject.CCC;

import java.util.Scanner;

public class CCC18S2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] table = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		sc.close();
	
		boolean bool = false;
		boolean bool2 = false;
		while (bool == false || bool2 == false) {
			table = rotate_clockwise(table);
			for (int i = 0; i < N; i++) {
				int[] temp = new int[N];
				temp = table[i];
				bool = checkIfOrdered(temp);

				int[] temp2 = new int[N];
				for (int j = 0; j < N; j++) {
					temp2[j] = table[j][0];
				}
				bool2 = checkIfOrdered(temp2);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] rotate_clockwise(int[][] table) {
		int N = table.length;
		int[][] temp = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				temp[i][j] = table[N - 1 - j][i];
			}
		}
		return temp;
	}
	
	public static boolean checkIfOrdered(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				return false;
			}
		}
		return true;
	}

}
