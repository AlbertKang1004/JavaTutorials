package javaProject.CCC;

import java.util.Arrays;
import java.util.Scanner;

public class CCC18S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
		}

		sc.close();
		Arrays.sort(arr);

		double min = Double.MAX_VALUE;
		for (int i = 1; i < arr.length - 1; i++) {
			double left = (arr[i] - arr[i - 1]) / 2;
			double right = (arr[i + 1] - arr[i]) / 2;
			if (min > left + right)
				min = left + right;
		}
		System.out.printf("%.1f",min);
	}

}
