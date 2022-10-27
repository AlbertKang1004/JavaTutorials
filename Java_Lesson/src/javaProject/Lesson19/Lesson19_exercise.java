package javaProject.Lesson19;

import java.util.Arrays;

public class Lesson19_exercise {

	public static void main(String[] args) {
		BankAccount[] ba = new BankAccount[300];
		ba[47] = new BankAccount(92);
		ba[102] = new BankAccount(1007);
		ba[222] = new BankAccount(92);

		int[] k = { 3, 6, 1, 77, 1, 3 };
		int[] jm = { 4, 6, 8, 1, 1, 8 };
		if (k[3] == jm[5])
			System.out.println(true);
		else
			System.out.println(false);

		int[] s = { 2, 6, 20, 8, 2, 1, 16, 4 };
		int[] ss = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		if (s[2] == ss[19])
			System.out.println(true);
		else
			System.out.println(false);

		if (ba[47].equals(ba[292]))
			System.out.println(true);
		else
			System.out.println(false);

		String suv[] = new String[20];
		int j = 0;
		while (j < 17) {
			suv[j] = "Hello";
			j++;
		}

		int physical_size = suv.length;
		System.out.println("physical size: " + physical_size);

		String d = "The quick brown fox jumped over the lazy dog.";
		char[] chars = d.toCharArray();
		for (char c : chars) {
			System.out.print(c + " ");
		}
		System.out.println();

		double rub[] = { 23.0, -102.1, 88.23, 111, 12.02, 189.119, 299.88 };
		double dub[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.arraycopy(rub, 3, dub, 4, 3);
		for (double c : dub) {
			System.out.print(c + " ");
		}
		System.out.println();

		double[] zz, top = { 12.1, 13.1, 14.1, 15.1, 18 };
		zz = top;
		zz[2] = 99;
		top[3] = 100.2;

		for (double c : zz) {
			System.out.print(c + " ");
		}
		System.out.println();

		for (double c : top) {
			System.out.print(c + " ");
		}
		System.out.println();

		char[] a, b;
		a = "Groovy dude".toCharArray();
		b = "I like this".toCharArray();
		System.arraycopy(a, 1, b, 0, 4);

		for (char c : a) {
			System.out.print(c + " ");
		}
		System.out.println(); // G r o o v y d u d e

		for (char c : b) {
			System.out.print(c + " ");
		}
		System.out.println(); // r o o v k e t h i s

		int[] ab = { 1, 2, 3, 4, 5 };
		int[] ac = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.binarySearch(ab, 4));
		System.out.println(Arrays.binarySearch(ac, 4)); // always have to be in ascending order

		double[] myArray = { 189.01, 2000, -32, 56, 182, 2 };
		Arrays.sort(myArray);
		for (double c : myArray) {
			System.out.print(c + " ");
		}
		System.out.println();

		System.out.println(Arrays.binarySearch(myArray, 56)); // 2
		System.out.println(Arrays.binarySearch(myArray, 102)); // negative number

		int xc[] = { 123, 97, -102, 17 };
		int pk[] = { 123, 79, -102, 17 };
		int gs[] = { 123, 97, -102, 17 };
		System.out.println(Arrays.equals(xc, pk) + "\n" + Arrays.equals(xc, gs));
		// false
		// true

		int pickle[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Arrays.fill(pickle, -1);
		System.out.println(pickle[4]); // -1

		int px[] = { 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(px[px[1] + 1]); // 8

	}

}
