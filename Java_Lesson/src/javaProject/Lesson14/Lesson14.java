package javaProject.Lesson14;

public class Lesson14 {

	public static void main(String[] args) {
		int x = 0x4CB3; // hex
		System.out.println(x); // 19635

		x = 0734; // oct
		System.out.println(x); // 476

		x = 0b00101100;
		System.out.println(x);

		int y = 3901;

		System.out.println(Integer.toHexString(y));
		System.out.println(Integer.toString(y, 16));

		System.out.println(Integer.toOctalString(y));
		System.out.println(Integer.toString(y, 8));

		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toString(y, 2));
		
		System.out.println(Integer.parseInt("335E", 16));
	}
}
