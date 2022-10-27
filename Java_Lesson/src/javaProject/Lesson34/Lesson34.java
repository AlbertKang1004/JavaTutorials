package javaProject.Lesson34;

public class Lesson34 {

	public static void main(String[] args) {
		int[] s = { 1, 2, 3, 4, 5, 6 };

		for (int g = 0; g < s.length; g++)
			System.out.print(s[g] + " ");
		System.out.println("\n");

		testMethod(s);
		for (int g = 0; g < s.length; g++)
			System.out.print(s[g] + " ");
	}

	public static void testMethod(int pp[]) {
		int len = pp.length;
		int[] t2 = new int[len];
		for (int j = 0; j < len; j++)
			t2[j] = pp[len - j - 1];
		for (int k = 0; k < t2.length; k++)
			System.out.print(t2[k] + " ");
		System.out.println("\n");
		pp = t2;
	}
}
