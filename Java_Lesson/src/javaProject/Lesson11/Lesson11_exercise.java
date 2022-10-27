package javaProject.Lesson11;

public class Lesson11_exercise {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 0;
		for (int b = 0; b < 5; b++)
			a++;
		System.out.println(a); // 5

		int c = 1;
		for (int d = 3; d >= 0; d--) {
			c = c + d;
		}
		System.out.println(c); // 7

		int e = 6;
		int f = 20, g;
		for (g = 1; g < e; g++) {
			f = f + g * g;
		}
		System.out.println(f); // 75

		double h = 1.0;
		for (int i = 0; i < 9; i++) {
			h *= 3;
		}
//		System.out.println(i); 

		for (int j = 0; j < 10; j++) {
			int k = 19 + j;
		}
//		System.out.println(k);

		double l = 100.01;
		int m = 0;
		for (int n = 0; n < 10; n++)
			m = 19 + n;
		l++;
		System.out.println(l);
	}

}
