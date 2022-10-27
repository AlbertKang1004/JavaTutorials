package javaProject.Lesson13;

import java.util.*;

public class Lesson13_exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		String s = "" + ch;
		System.out.println(s);

		System.out.print("Enter a String: ");
		String n = sc.next();
		char ch2 = n.charAt(0);
		System.out.println(ch2);
		sc.close();

		char k = 'B';
		System.out.println(k + 3); // 69
		System.out.println((char) (k + 3)); // E

		for (int i = 0; i <= 127; i++) {
			char ch3 = (char) i;
			if (Character.isWhitespace(ch3)) {
				System.out.println(i);
			}
		}

	}

}
