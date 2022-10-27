package javaProject.Lesson28;

public class Lesson28 {

	public static void main(String[] args) {
		System.out.println(90 & 107);
		// 0101 1010
		// 0110 1011
		//----------
		// 0100 1010 = 74

		System.out.println(90 | 107);
		// 0101 1010
		// 0110 1011
		//----------
		// 0111 1011 = 123
		
		System.out.println(90 ^ 107);
		// 0101 1010
		// 0110 1011
		//----------
		// 0011 0001 = 49
		
		System.out.println(~90);
		// 0101 1010
		//----------
		// 1010 0101 = -91
	}

}
