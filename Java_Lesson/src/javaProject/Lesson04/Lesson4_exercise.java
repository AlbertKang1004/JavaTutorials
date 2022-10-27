package javaProject.Lesson04;

public class Lesson4_exercise {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int h = 103;
		int p = 5;
		System.out.println(++h + p);
		System.out.println(h);

		double def;
		double f = 1992.37;
		def = f;
		System.out.println(def);

		int zulu = 0;
		System.out.println(zulu--);

		int a = 100;
		int b = 200;
		b /= a;
		System.out.println(b + 1);

		int r = 10;
//		int v = r -= 30;
		r = r - 30;
		int v = r;
		System.out.println(v);

		int p2 = 40;
		int q = 4;
		System.out.println(2 + 8 * q / 2 - p);

		int sd = 12;
		int xx = 4;
		System.out.println(sd % (++xx));
		System.out.println(xx);

		double m1 = 3.14;
		double m2 = 3.14;
		double m3 = 3.14;

		int x, y, z;

		int m = 36;
		int j = 5;
		m = m / j;
		System.out.println(m);

		System.out.println(3 / 4 + 5 * 2 / 33 - 3 + 8 * 3);

		int i = 3;
		int j2 = 2;
		int k = i % j2;
		System.out.println(k);

		int j3 = 2;
		System.out.println(7 % 3 + j3++ + (j3 - 2));

		j--;
		--j;
		j -= 1;
	}

}
