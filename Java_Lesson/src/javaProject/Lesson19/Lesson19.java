package javaProject.Lesson19;

import java.util.Arrays;

public class Lesson19 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int first[] = { 1, 2, 3, 4, 5 };
		int sec[];
		sec = first;
		sec[2] = 99;
		System.out.println(first[2]);

		char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		char nn[] = { '1', '2', '3', '4', '5', '6', '7', '8' };
		System.arraycopy(ch, 1, nn, 2, 3);
		for (char c : ch) {
			System.out.print(c + " | ");
		}
		System.out.println();
		System.out.println();
		for (char c : nn) {
			System.out.print(c + " | ");
		}
		System.out.println();

		char characters[];
		String s = "ABCDE";
		characters = s.toCharArray();
		for (char c : characters) {
			System.out.print(c + " | ");
		}
		System.out.println();

		int[] b = { 14, 2, 109, -33, 25 };
		Arrays.sort(b);
		for (int c : b) {
			System.out.print(c + " | ");
		}

		System.out.println(Arrays.binarySearch(b, 109));

		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = { 1, 2, 3, 4, 5 };
		int[] z = { 1, 2, 3, 6, 7 };

		System.out.println(Arrays.equals(x, y));
		System.out.println(Arrays.equals(x, z));

		Arrays.fill(x, 123);
		for (int c : x) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(y));

		int array[] = { 5, 6, 7, 8, 9, 10 };
		System.out.println(array[array[0]]); // 5

		int num[] = { 4, 3, 2, 1 };
		int sum = 0;
		for (int j = 0; j < num.length; j++) {
			sum += num[j] * num[j];
		}
		System.out.println(sum); // 30

		// OR
		sum = 0;
		for (int c : num) {
			sum += c * c;
		}
		System.out.println(sum); // 30

		String str[] = { "one", "two", "three" };
		for (String c : str) {
			c = "zero";
		}

		for (String c : str) {
			System.out.print(c + " ");
		}
		System.out.println(); // nothing chanegs

	}

}
