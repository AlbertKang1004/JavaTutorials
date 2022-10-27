package javaProject.Lesson18;

import java.util.*;

public class Lesson18 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		int grade1 = 97, grade2 = 62, grade3 = 85;
		int a[] = new int[400];
//		a[0] = 97;
//		a[1] = 62;
//		a[2] = 85;

		int a2[] = { 97, 62, 85 };
		System.out.println(a2.length); // prints the length of an array

		int sq[] = new int[1000];
		for (int j = 0; j < sq.length; j++) {
			sq[j] = j * j;
		}

		int numStudents = 5;
		String name[] = new String[numStudents];
		int grade[] = new int[numStudents];

		for (int j = 0; j < numStudents; j++) {
			Scanner kbReader1 = new Scanner(System.in);
			System.out.print("Enter the student name: ");
			name[j] = kbReader1.nextLine();
			Scanner kbReader2 = new Scanner(System.in);
			System.out.print("Enter the grade: ");
			grade[j] = kbReader2.nextInt();
			kbReader1.close();
			kbReader2.close();
		}
	}

}
