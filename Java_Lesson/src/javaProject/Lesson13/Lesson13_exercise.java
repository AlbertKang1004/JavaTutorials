package javaProject.Lesson13;

public class Lesson13_exercise {

	public static void main(String[] args) {
		System.out.println((int) 'A');
		System.out.println((int) 'Z');

		System.out.println((int) 'a');
		System.out.println((int) 'z');

		int count = 0;
		for (int i = 0; i < 128; i++) {
			if (Character.isLetter((char) i)) {
				count++;
			}
		}
		System.out.println(count);

		System.out.println((int) '0');
		System.out.println((int) '9');

		char c;
		for (int j = 97; j <= 122; j++) {
			c = (char) (j - 32);
			System.out.println(c);
		}

		String s = "Alfred E. Neuman";
		char ch;
		for (int x = 0; x < s.length(); x++) {
			ch = s.charAt(x);
			if ((ch <= 90) && (ch >= 65))
				ch = (char) (ch + 32);
			System.out.print(ch);
		}

	}

}
