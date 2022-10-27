package javaProject.Lesson29;

public class Lesson29_project {

	public static void main(String[] args) {
		int p = 386, q = 581, n = 0;

		System.out.println("Hello");
		for (int j = 0; j < 1000000; j++) {
			for (int k = 0; k < 10000; k++)
				for (int m = 0; m < 10; m++)
					n = ((p * 2) + q) / 2;
		}
		System.out.println(n);

		for (int j = 0; j < 1000000; j++) {
			for (int k = 0; k < 10000; k++)
				for (int m = 0; m < 10; m++)
					n = p + (q >> 1);
		}
		System.out.println(n);
	}

}
