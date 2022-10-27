package javaProject.Lesson48;

import java.util.*;

public class Lesson48_project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		long startTime = System.nanoTime();
		int d = 1;
		do {
			if (n % d == 0) {
				System.out.print(d + " ");
			}
			d++;
		} while (d <= n / 2);
		System.out.print(n);
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		System.out.println();
		System.out.printf("Your algorithm took %fs to run.\n", (elapsedTime) / 1_000_000_000.0);
		// 3.238688s 3.118279s 3.169870s 3.175315s 3.277176s
		// AVG: 3.1958656s
	}

}
