package javaProject.Lesson09;

import java.util.*;

public class Lesson9_project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();

		if (num % 2 == 0)
			System.out.println("The integer " + num + " is even");
		else
			System.out.println("The integer " + num + " is odd");
		scanner.close();
	}

}
