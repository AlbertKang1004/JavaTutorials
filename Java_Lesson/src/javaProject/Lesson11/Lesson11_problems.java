package javaProject.Lesson11;

public class Lesson11_problems {

	public static void main(String[] args) {
		int sum = 0;
		for (int k = 0; k < 5; k++) {
			sum += k;
		}
		System.out.println(sum); // 10

		double kk = 3;
		int j = 0;
		for (j = 0; j <= 100; j++) {
			kk = kk + Math.pow(j, 2);
			++kk;
		}
		System.out.println(j); // 101

		double p = 0;
		for (int m = 10; m > 6; --m) {
			if (m == 7) {
				p = p + m;
			} else {
				++p;
			}
		}
		System.out.println(p); // 10.0

		for (j = 1; j < 10; j = j + 2)
			System.out.println(j);

//		double x = 0;
//		for (int b = 0; b < 101; b++) {
//			x = x + 1;
//			b--;
//		}
//		System.out.println(x); // No result

		int p2, q = 5;
		for (p2 = 0; p2 < 5; p2++)
			q = q + 1;
		System.out.println(p2 + " " + q); // 5 10

		int j2, k;
		int count = 0;
		for (j2 = 0; j2 < 4; j2++) {
			for (k = 0; k < 10; k++) {
				count++;
			}
		}
		System.out.print(count--); //40
		System.out.println(count); // 39
	}

}
