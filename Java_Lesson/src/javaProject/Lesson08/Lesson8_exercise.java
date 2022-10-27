package javaProject.Lesson08;

public class Lesson8_exercise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int z = 23, x = -109;
		double c = 2345.19, v = 157.03;
		boolean a = false, s = true;

		boolean gus = (x > 0) && (c == v);
		System.out.println(!gus); // true

		System.out.println(a || s); // true
		System.out.println(((-1 * x) > 0) && !a); // true

		boolean r = z == x;
		System.out.println(r || false); // false

		System.out.println(z != x); // true

		boolean p = true, q = false;
		boolean b = p && q;
		System.out.println(b); // false

		int a2 = 22, b2 = 22;
		boolean kDog = a2 != b2;
		System.out.println(kDog);
		kDog = !(a2 == b2);
		System.out.println(kDog);

		System.out.println((true && false) || ((true && true) || false)); // true
		System.out.println(true && true || false); // true
		System.out.println(false || true && false); // false
		System.out.println(false && true || false); // false
	}

}
