package javaProject.Lesson18;

public class Lesson18_project {

	public static void main(String[] args) {

		char[] ch = new char[26];
		for (int i = 0; i < 26; i++) {
			ch[i] = (char) (i + 65);
		}

		for (char c : ch) {
			if (c == 'Z')
				System.out.print(c);
			else
				System.out.print(c + ", ");
		}
	}

}
