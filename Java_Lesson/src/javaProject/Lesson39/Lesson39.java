package javaProject.Lesson39;

public class Lesson39 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int n = 400000; // Assume it's a big number
		for (int i = 0; i < n; i++) {
			// Complexity Analysis: O(n)
		}

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				// Complexity Analysis: O(n^2)
			}
		}

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n + 50; k++) {
				// Complexity Analysis: O(n^2 + 50n)
				// Since n is extremely big,
				// we can eliminate the term 50n.
				// Complexity Analysis: O(n^2)
			}
		}

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < (22 * n); k++) {
				// Complexity Analysis: O(22n^2)
			}
		}

		int[][] x = new int[5][6];
		int row, col;
		int[] b = new int[x.length];
		for (row = 0; row < x.length; row++) {
			for (col = 0; col < x[row].length; col++) {
				b[row] += x[row][col];
				// Complexity Analysis: O(n)
			}
		}

		for (int j = 0; j < 500; j += 5) {
			for (int k = 1; k < 500; k *= 3) {
				// Complexity Analysis: O(nlog_3(n)/5)
				// Complexity Analysis: O(nlog(n)) // SIMPLIFIED
			}
		}

		int m = -9; 
		for (int j = 0; j < 5000; j += 5) {
			if (j < m) {
				for (int k = 0; k < 5000; k *= 3) {
					// j would never be under m
					// Complexity Analysis: O(n)
				}
			}
		}
		
		for (int j = 0; j < n ; j++) {
			for (int k = j; k < n; k++) {
				// Complexity Analysis: O(n^2)
				// n + (n - 1) + (n - 2) + ... + (n - (n - 1))
			}
		}
		
		int sum = 0; 
		for (int j = n; j > 0; j/=2) {
			for (int k = 0; k < j; k++) {
				sum += (2 * k * j) % n;
				
				// Complexity Analysis: O(n)
			}
		}

	}

}
