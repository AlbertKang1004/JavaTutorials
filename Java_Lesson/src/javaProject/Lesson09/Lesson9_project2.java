package javaProject.Lesson09;

import java.util.*;

public class Lesson9_project2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = sc.nextLine();

		if (password.equals("XRay"))
			System.out.println("Password entered successfully.");
		else
			System.out.println("Incorrect password.");
		sc.close();

		int k = 79;
		if (k < 50) {
			if (k < 60) {
				System.out.println("One");
			} else {
				System.out.println("Two");
			}
		} else {
			if (k > 30) {
				System.out.println("Three");
			} else {
				System.out.println("Four");
			}
		}

	}

}
