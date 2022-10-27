package javaProject.Lesson51;

public class Lesson51_problems {

	public static void main(String[] args) {
		String[] str = { "alpha", "beta", "delta", "omega", "phi" };
		binarySearch(str, 0, str.length - 1, "epsilon");

	}

	public static boolean binarySearch(Comparable<String> p[], int start, int end, Comparable<String> thing) {
		if (start > end)
			return false;
		int m = (start + end) / 2;
		if (p[m].equals(thing))
			return true;
		else if (p[m].compareTo((String) thing) < 0) {
			System.out.print(".");
			return binarySearch(p, m + 1, end, thing);
		} else {
			System.out.print(".");
			return binarySearch(p, start, m - 1, thing);
		}
	}

}
