package javaProject.Lesson33;

public class Lesson33_exercise {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		int m = 200;
		System.out.println(a && b ? m * m : --m);
		// 199

		boolean m2 = true;
		boolean n = true;
		boolean v = m2 || n ? (m2 && !n) : (m2 || !n);
		System.out.println(v);

		double g = 5.0, h = -2.0, s = 9.0;
		int ii = (g >= h) ? (int) (h + 2) : (int) (s++);
		System.out.println(ii); // 0

		int soy = 12, tabasco = 10, noodles = 4, sauce = 0;
		int ugh = (Math.pow(soy, noodles) < tabasco) ? 12 : sauce == tabasco ? 11 : 122;
		System.out.println(ugh); // 122

		int bq = 3, j = 1;
		int z = bq < j + 1 ? 1 : 2;
		System.out.println(z);

		String toy = "Barbie";
		double price = 20.13;
		String s3 = (toy.equals("Barbie")) ? (price > 20.13) ? "maybe" : "yes" : "no way";
		System.out.println(s3); // no way / yes
	}

}
