package javaProject;

import java.util.*;

public class J1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();

		if (month < 2) {
			System.out.println("Before");
		} else if (month == 2) {
			if (day < 18) {
				System.out.println("Before");
			} else if (day == 18) {
				System.out.println("Special");
			} else {
				System.out.println("After");
			}
		} else {
			System.out.println("After");
		}
		scanner.close();
	}

}
