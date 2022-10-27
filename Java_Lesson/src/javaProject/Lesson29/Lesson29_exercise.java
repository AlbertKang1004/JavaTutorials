package javaProject.Lesson29;

public class Lesson29_exercise {

	public static void main(String[] args) {
		int m = 45;
		int k = 102;
		int p = 4;

		System.out.println(m << 2); // 45 * 2 * 2 = 180
		System.out.println((m / 2) >> 2); // 45 / 2 / 2 / 2 = 5
		System.out.println(k << p); // 102 * 2 * 2 * 2 * 2 = 1632
		System.out.println(-m >>> 2); // some weird number
		System.out.println(k << 1); // 102 * 2 = 204
		System.out.println(222 >>> 2); // 222 / 2 / 2 = 55
		System.out.println(p >> p); // 4 / 2 / 2 / 2 / 2 = 0

		int jz = 3;
		int ii = 5;
		if ((ii > 2) & (jz == ii--)) {
		}
		System.out.println(ii); // no skipping -> 4

		int mk = 3;
		int sd = -4;
		if ((sd > 2) & (sd == ++mk)) {
		}
		System.out.println(mk); // no skipping -> 4

		mk = 3;
		sd = -4;
		if ((Math.abs(sd) > 2) | (sd == ++mk)) {
		}
		System.out.print(mk++); // 4
		System.out.println(mk++); // 5
		// 45
		
		System.out.println(122 & 18 & 79);
		// 111 1010 = 122
		// 001 0010 = 18
		// 100 1111 = 79
		// --------
		// 000 0010 = 2
		
		System.out.println(122 | 18 | 79);
		// 111 1010 = 122
		// 001 0010 = 18
		// 100 1111 = 79
		// --------
		// 111 1111 = 127
		
		System.out.println(122 | 18 & 79);
		// 001 0010 = 18
		// 100 1111 = 79
		// --------
		// 000 0010 = 2
		// 111 1010 = 122
		// --------
		// 111 1010 = 122
		
		System.out.println(122 & 18 | 79);
		// 111 1010 = 122
		// 001 0010 = 18
		// --------
		// 001 0010 = 18
		// 100 1111 = 79
		// --------
		// 101 1111 = 95
	}

}
