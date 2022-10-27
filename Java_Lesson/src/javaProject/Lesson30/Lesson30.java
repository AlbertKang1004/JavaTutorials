package javaProject.Lesson30;

import java.util.*;

public class Lesson30 {

	public static void main(String[] args) {
		Random rn = new Random();
		int x = rn.nextInt();
		System.out.println(x);

		int y = rn.nextInt(21); // 0 to 20
		System.out.println(y);

		double d = rn.nextDouble(); // 0 to 1 (not 1 itself)
		System.out.println(d);

		int r = 0, count = 0;
		Random rm = new Random();
		for (int j = 0; j < 1000; j++) {
			r = 90 + rm.nextInt(21);
			System.out.print(r + " ");
			count++;
			if (count > 15) {
				System.out.println();
				count = 0;
			}
		}

	}

}
