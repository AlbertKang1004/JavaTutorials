package javaProject.Lesson12;
import java.util.*;
public class Lesson12_exercise {

	public static void main(String[] args) {
		int m = 97;
		while (m <= 195) {
			int k = 0, p = 0;
			k = k * k + 3 * m;
			p = p + m + 1;
			m++;
		}
		System.out.println(m);

		int v = 2;
		do {
			int k = 0;
			double q = 0;
			k = k * k + 3 * v;
			q = Math.sqrt(q + v + 1);
			v++;
		} while (v <= 195);
		System.out.println(v);

//		int j = 25;
//		while (j <= 100 || j >= 25) {
//			System.out.println("Temp variable = " + j);
//			j++;
//		}

		int i = 0, n = 0;
		while (i <= 3) {
			for (n = 0; n <= 2; n++) {
				System.out.print(i + "," + n + " ");
			}
			i++;
		}

		double m1 = 92.801;
		int j = 0;
		do {
			j = j + 2;
			if (j > -100)
				continue;
			m1 += 3;
		} while (j < 6);
		System.out.println(m1); // 92.801
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("Enter an integer: ");
			num = sc.nextInt();
			System.out.println(Math.sqrt(num));
		} while (num != 0);
	
		sc.close();
	}
}
