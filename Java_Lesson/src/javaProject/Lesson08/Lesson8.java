package javaProject.Lesson08;

public class Lesson8 {

	public static void main(String[] args) {
		int x = 79;
		double d = 13.89, jj = 40.0;
		boolean b = true, c = false;
		System.out.println(b);

		System.out.println(true && false);
		System.out.println(true && !false);

		System.out.println(c || (d > 0));
		System.out.println(!b || c);

		System.out.println((x > 102) && true);

		System.out.println((jj == 1) || false);
		System.out.println((jj == 40 && !false));

		System.out.println(x != 3);
		System.out.println(!(x != 3));

		System.out.println(!!true);
	}

}
