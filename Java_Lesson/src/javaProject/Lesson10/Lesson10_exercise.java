package javaProject.Lesson10;

public class Lesson10_exercise {

	public static void main(String[] args) {
		int x = 3, y = 5, z = -8;
		switch (x) {
		case 2:
			y++;
		case 3:
		case 4:
			z += (--y);
			break;
		case 5:
			z += (y++);
		}

		System.out.println(z); // -4

		int a = 2, b = 0;
		switch (a) {
		case 1:
			b++;
		case 2:
			b++;
		case 3:
			b++;
		case 4:
			b++;
		default:
			b++;
		}
		System.out.println(--b); // 3

		char chr = 'z';
		System.out.println(chr);

		int d = 10, e = 12;
		System.out.println("The sum is " + d + e); // The sum is 1012
		System.out.println("The sum is " + (d + e)); // The sum is 22

		int speed = 66;
		switch (speed) {
		case 65:
			System.out.println("Cruising");
			break;
		case 69:
		case 70:
			System.out.println("Getting close");
			break;
		case 75:
			System.out.println("Exceeding speed limit");
			break;
		default:
			System.out.println("Very slow");

		}
		
		String s = "X";
		char ch = s.charAt(0);
		System.out.println(ch);
	}

}
