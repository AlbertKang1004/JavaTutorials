package javaProject.Lesson29;

public class Lesson29 {

	public static void main(String[] args) {
		
		System.out.println(7 << 3); // 7 * 2 * 2 * 2 = 56
		
		System.out.println(-7 << 3); // -7 * 2 * 2 * 2 = -56
		
		System.out.println(32 >> 3); // 32 / 2 / 2 / 2 = 4
		
		System.out.println(-32 >> 3); // push and reset with 1
		System.out.println(-32 >>> 3); // push and reset with 0

		int j = 34;
		int p = 0;
		if ((p == 2) && (++j == 19)) {}
		System.out.println(j);
		
		if ((p == 2) & (++j == 19)) {}
		System.out.println(j);
		
		// We can stack the operators
		
		System.out.println(23 & 19 & 106);
		// 001 1011 = 23
		// 001 0011 = 19
		// 110 1010 = 106
		// --------
		// 000 0010 = 2
		
		System.out.println(23 | 19 | 106);
		// 001 1011 = 23
		// 001 0011 = 19
		// 110 1010 = 106
		// --------
		// 111 1011 = 123
		
		// Precedence: ~& ---> ^ ---> |
	}

}
