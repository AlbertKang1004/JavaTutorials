package javaProject.Lesson34;

@SuppressWarnings("static-access")
public class Lesson34_problem {

	public static void main(String args[]) {
		int[] prf = { 13, 22, 89, 15 };
		double d = 30.89;
		Circle myCir = new Circle(18);
		myCir.rad = 14;
		fg(prf, d, myCir);
		System.out.println(d); // 30.89
		System.out.println(prf[2]); // 16
		System.out.println(myCir.rad); // 122
	}

	public static void fg(int[] x, double d, Circle c) {
		d++;
		x[2] = 16;
		c.rad = 122;
		System.out.println(d++); // 31.89
		int nn[] = new int[x.length];
		nn[3] = x[0];
		x = nn;
	}
}