package javaProject.Lesson40;

public class Lesson40 {

	public static void main(String[] args) {

		System.out.println(factorial(4)); // 24
		System.out.println(adder(7)); // 46
		System.out.println(nertz(5)); // 120
		System.out.println(nrd(0)); // 25
		System.out.println(festus(0)); // 12
		homer(9); // 1,2,4,9
		System.out.println();
		method1(7); // 1,3,5,7
		System.out.println();
		System.out.println(fib(5)); // 5 (1,1,2,3,5)
		System.out.println(pls(4)); // 85
		f(3); // {{{x}}}
		System.out.println();
		g(6,2); // 124
		System.out.println();
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static int adder(int n) {
		if (n <= 0)
			return 30;
		else
			return n + adder(n - 2);
	}

	public static int nertz(int n) {
		if (n == 1)
			return 1;
		else
			return n * nertz(n - 1);
	}

	public static int nrd(int n) {
		if (n > 6)
			return n - 3;
		else
			return n + nrd(n + 1);
	}

	public static int festus(int n) {
		if (n > 6)
			return n - 3;
		else {
			n = n * 2;
			return n + festus(n + 1);
		}
	}

	public static void homer(int n) {
		if (n <= 1)
			System.out.print(n);
		else {
			homer(n / 2);
			System.out.print("," + n);
		}
	}

	public static void method1(int n) {
		if (n <= 1)
			System.out.print(n);
		else {
			method1(n - 2);
			System.out.print("," + n);
		}
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static int pls(int n) {
		if (n == 0) {
			return 5;
		} else if (n == 1) {
			return 11;
		} else {
			return pls(n - 1) + 2 * pls(n - 2);
		}
	}

	public static void f(int z) {
		if (z == 0) {
			System.out.println("x");
		} else {
			System.out.print("}");
			f(z - 1);
			System.out.print("{");
		}
	}

	public static void g(int x, int y) {
		if (x / y != 0) {
			g(x / y, y);
		}
		System.out.print(x / y + 1);
	}
}
