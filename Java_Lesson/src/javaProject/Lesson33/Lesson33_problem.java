package javaProject.Lesson33;

public class Lesson33_problem {

	public static void main(String[] args) {
		boolean p = true, q = false;
		boolean perk;
		perk = !p || q ? p && q : p || q;
		System.out.println(perk);

		int j = 3, g = 3;
		int m;
		if (j == g) {
			m = j++;
		} else {
			m = 37;
		}
		System.out.println(m);

		boolean x = false, y = false;
		double coneHeight;
		coneHeight = !(x && y) ? 18.3 : 5 * Math.PI;
		System.out.println(coneHeight);
	}

}
