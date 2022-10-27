package javaProject.Lesson22;

public class Lesson22_problems {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int j = 2, k = 3;
		Integer bj, bk;
		while (k > 0) {
			j = j * k;
			k = k / 2;
		}
		bj = j;
		bk = k;
		System.out.println(bj + bk);

		int total = 0;
		String a = "22222";
		Integer p1, p2;
		for (int j2 = a.length() - 1; j2 > 1; j2--) {
			p1 = j2 - 1;
			p2 = j2;
			total += j2;
		}
		System.out.println(total);

		Integer trial;
		int div = 2;
		double d = Math.PI / div;
		trial = (int) d;
		System.out.println(trial);
		
		double d2 = 117.8;
		d2 *= 2;
		Double dw = d2;
		System.out.println(dw);
	}

}
