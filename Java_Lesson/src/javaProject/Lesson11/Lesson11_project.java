package javaProject.Lesson11;

import java.util.*;

public class Lesson11_project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter your name. ");
		String name = sc.nextLine().toLowerCase();
		sc.close();

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
