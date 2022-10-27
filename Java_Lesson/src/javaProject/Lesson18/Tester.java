package javaProject.Lesson18;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;

		do {
			System.out.print("Type in a sentence and press ENTER. ");
			String s = sc.nextLine();
			if (s.equals("exit")) {
				bool = false;
			} else {
				s += "|";
				String sp[] = s.split("(?i)[A]\\s*[S]");
				System.out.println("There are " + (sp.length - 1) + " occurences.");
			}
		} while (bool);
		sc.close();
	}

}
