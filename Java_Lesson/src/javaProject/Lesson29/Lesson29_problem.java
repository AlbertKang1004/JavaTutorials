package javaProject.Lesson29;

public class Lesson29_problem {

	public static void main(String[] args) {
		int p = 9;
		int q = -1;
		boolean sim = (q-- > 5) & (p++ > 22);
		System.out.println(p + " " + sim);

		int[] k = { 2, 0, 3, 3, 5, 4, 2, 7, 3, 3 };
		p = 0;
		for (int j = 0; j < k.length; j++)
			if (k[j] >= 0 & k[j] <= k.length & k[k[j]] == 3)
				p++;
		System.out.println(p);

		int[] k2 = { 6, 0, 3, 3, 5, -1, 12, 7, 3, 3 };
		p = 0;
		for (int j = 0; j < k2.length; j++) {
			if (k2[j] >= 0 && k2[j] < k2.length && k2[k2[j]] == 3)
				p++;
		}
		System.out.println(p);
	}

}
