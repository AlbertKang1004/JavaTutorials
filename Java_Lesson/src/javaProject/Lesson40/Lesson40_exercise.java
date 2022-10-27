package javaProject.Lesson40;

public class Lesson40_exercise {

	public static void main(String[] args) {
		System.out.println(rig(4)); // -8
		System.out.println(mm(6)); // 31
		System.out.println(adrml(5)); // 15
		System.out.println(bud(1)); // 19
		System.out.println(zing(0)); // 40 --> 54
		crch(12); // 0,1,4,12
		System.out.println();
		elvis(11); // 3>>4>>7>>10
		System.out.println();
		System.out.println(sal(5));
		puf(4); // {<{x}>}
		System.out.println();
		bc(6, 2); // 634

	}

	public static int rig(int n) {
		if ((n == 0)) {
			return 5;
		} else if (n == 1) {
			return 8;
		} else {
			return rig(n - 1) - rig(n - 2);
		}
	}

	public static int mm(int n) {
		if (n <= 0)
			return 10;
		else
			return n + mm(n - 1);
	}

	public static int adrml(int n) {
		if (n <= 1)
			return n;
		else
			return n * adrml(n - 2);
	}

	public static int bud(int n) {
		if (n > 5)
			return n - 2;
		else
			return n + bud(n + 1);
	}

	public static int zing(int n) {
		if (n > 10)
			return n - 2;
		else {
			n = n * 3;
			return n + zing(n + 2);
		}
	}

	public static void crch(int n) {
		if (n <= 0)
			System.out.print(n);
		else {
			crch(n / 3);
			System.out.print("," + n);
		}
	}

	public static void elvis(int n) {
		if (n <= 3)
			System.out.print(n + 1);
		else {
			elvis(n - 3);
			System.out.print(">>" + (n - 1));
		}
	}

	public static int sal(int n) {
		if (n == 2) {
			return 100;
		} else if (n == 3) {
			return 200;
		} else {
			return (2 * sal(n - 1) + sal(n - 2) + 1);
		}
	}

	public static void puf(int n) {
		if (n == 1) {
			System.out.print("x");
		} else if (n % 2 == 0) {
			// n is even
			System.out.print("{");
			puf(n - 1);
			System.out.print("}");
		} else {
			// n is odd
			System.out.print("<");
			puf(n - 1);
			System.out.print(">");
		}

	}

	public static void bc(int p, int q) {
		if (p / q == 0) {
			System.out.println(p + q + 1);
		} else {
			System.out.println(p);
			bc(p / q, q);
		}
	}

}
