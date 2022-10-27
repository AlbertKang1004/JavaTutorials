package javaProject.CCC;

import java.util.*;

public class CCC21S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] height = new double[num + 1];
		double[] base = new double[num];

		for (int i = 0; i < height.length; i++) {
			height[i] = sc.nextInt();
		}
		for (int j = 0; j < base.length; j++) {
			base[j] = sc.nextInt();
		}

		sc.close();
		
		double sum = 0;

		for (int i = 0; i < num; i++) {
			sum += (((height[i] + height[i + 1]) / 2) * base[i]);
		}
		System.out.println(sum);
	}

}
