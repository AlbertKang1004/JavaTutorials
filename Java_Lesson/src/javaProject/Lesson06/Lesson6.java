package javaProject.Lesson06;

public class Lesson6 {

	public static void main(String[] args) {
		double a = -379.22;
		System.out.println(Math.abs(a)); // | -379.22 |

		double b = 42.01;
		double c = 3.728;
		System.out.println(Math.pow(b, c)); // 4.201 ^ 3.728

		double d = 2034.56;
		System.out.println(Math.sqrt(d)); // √2034.56

		double e = 1.4;
		System.out.println(Math.ceil(e));

		double f = -1.6;
		System.out.println(Math.floor(f));

		double g = 7.89;
		System.out.println(Math.log(g)); // log_e(7.89)

		double h = 2038.5;
		double i = -8999.0;

		System.out.println(Math.min(h, i));
		System.out.println(Math.max(h, i));

		double j = 148.7;
		System.out.println(Math.round(j));

		System.out.println(Math.PI);
		System.out.println(Math.E);

		double k = Math.PI / 5; // 36°
		System.out.println(Math.sin(k));
		System.out.println(Math.cos(k));
		System.out.println(Math.tan(k));
		
		double l = 0.1234;
		System.out.println(Math.asin(l));
		System.out.println(Math.acos(l));
		System.out.println(Math.atan(l));
		
		System.out.println(Math.toDegrees(Math.asin(l)));
		System.out.println(Math.toDegrees(Math.acos(l)));
		System.out.println(Math.toDegrees(Math.atan(l)));
	}

}
