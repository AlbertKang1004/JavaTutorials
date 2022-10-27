package javaProject.Lesson30;

import java.util.*;

public class Lesson30_exercise {

	public static void main(String[] args) {
		Random rn = new Random();
		double r = 0;
		int count = 0;
		for (int j = 0; j < 20; j++) {
			r = 22.5 + 10 * rn.nextDouble();
			System.out.print(r + " ");
			count++;
			if (count > 2) {
				System.out.println();
				count = 0;
			}
			
		}
		
		System.out.println();
		System.out.println();
		
		int r2 = 0;
		for (int j = 0; j < 20; j++) {
			r2 = 18 + rn.nextInt(8);
			System.out.print(r2 + " ");
			count++;
			if (count > 15) {
				System.out.println();
				count = 0;
			}
		}
		
		System.out.println();
		System.out.println();
		
		int r3 = 0;
		count = 0;
		for (int j = 0; j < 20; j++) {
			r3 = 100 + 25 * rn.nextInt(4);
			System.out.print(r3 + " ");
			count++;
			if (count > 10) {
				System.out.println();
				count = 0;
			}
		}

	}

}
