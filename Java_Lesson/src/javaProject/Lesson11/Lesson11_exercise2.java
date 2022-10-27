package javaProject.Lesson11;

public class Lesson11_exercise2 {
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		for (int i = 3; i <= 24; i *= 2) {
			System.out.println(i);
		}

		for (int j = 24; j >= 3; j /= 2) {
			System.out.println(j);
		}

		int k = 0;
		for (int j = 0; j <= 10; j++) {
			if (j == 5) {
				break;
			} else {
				k++;
			}
		}
		System.out.println(k); // 5

		int i, j;
		for (i = 10; i <= 100; i = i + 10) {
			j = i / 2;
			System.out.println(j);
		}

		int a, b;
		for (b = 1; b < 10; b = b * 2) {
			a = 2 * b;
		}
//		System.out.println(a);
		
		int count = 0;
		for (int p = 9; p <= 145; p++) {
			count++;
		}
		System.out.println(count);

	}

}
