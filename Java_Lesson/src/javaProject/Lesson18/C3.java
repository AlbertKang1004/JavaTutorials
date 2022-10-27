package javaProject.Lesson18;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[2];
		int[] y = new int[2];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int times = sc.nextInt();
		sc.close();

		int max = Math.abs(x[1] - x[0]) + Math.abs(y[1] - y[0]);

		if ((times - max) % 2 == 0 && times >= max)
			System.out.println("Y");
		else
			System.out.println("N");
	}

}
