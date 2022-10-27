package javaProject.Lesson12;

public class Lesson12_problems {

	public static void main(String[] args) {

		int sum = 0;
		for (int j = 0; j < 100; j++) {
			sum += j;
		}
		System.out.println(sum);

		int j = 0;
		sum = 0;
		while (j < 100) {
			j++;
			sum += j;
		}
		System.out.println(sum);

		j = 0;
		sum = 0;
		while (j < 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);

		j = 0;
		sum = 0;
		do {
			sum += j;
			j++;
		} while (j < 100);
		System.out.println(sum);

//		int z = 19;
//		int count = 0;
//		while (z < 20) {
//			if (z < 100)
//				continue;
//			z++;
//			count++;
//		}
//		System.out.println(count); // Infinite loop

		int k = 0, p = 0;
		do {
			if (k == 1) {
				p += 3;
			}
			k++;
			p--;
		} while (k < 3);
		System.out.println(p); // 0

		boolean p1 = true;
		sum = 0;
		boolean b = false;
		while (p1) {
			sum += 5;
			if (b || !b)
				break;
		}
		System.out.println(sum); // 5
	}

}
