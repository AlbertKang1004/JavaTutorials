package javaProject.Lesson48;

import java.util.*;

public class Lesson48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int d = 1;
		do {
			if (n % d == 0) {
				System.out.print(d + " ");
			}
			d++;
		} while (d <= n / 2);
		System.out.print(n);
	}

}
