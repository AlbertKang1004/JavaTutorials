package javaProject.Lesson30;

import java.util.*;

public class Lesson30_2 {

	public static void main(String[] args) {
		Random rn = new Random();
//		double r = 0, count = 0;
//		for (int j = 0; j < 1000; j++) {
//			r = 34.7838 + (rn.nextDouble() * 152.2722);
//			System.out.print(r + " ");
//			count++;
//			if (count > 15) {
//				System.out.println();
//				count = 0;
//			}
//		}
		
		System.out.println(rn.nextBoolean());
		System.out.println(rn.nextGaussian());
	}

}
