package javaProject.Lesson17;

import java.util.*;

public class Lesson17_project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String PLUS = "\\s*\\+\\s*";
		final String MINUS = "\\s*\\-\\s*";

		System.out.print("Enter the formula: ");
		String s = sc.nextLine();

		sc.close();

		int sum = 0;

		Scanner sc2 = new Scanner(s);
		sc2.useDelimiter(PLUS);
		while (sc2.hasNext()) {
			String temp = sc2.next();
			if (temp.contains("-")) {
				Scanner sc3 = new Scanner(temp);
				sc3.useDelimiter(MINUS);
				int diff = sc3.nextInt();
				while (sc3.hasNextInt()) {
					diff -= sc3.nextInt();
				}
				sum += diff;
				sc3.close();
			} else {
				sum += Integer.parseInt(temp);
			}
		}

		System.out.println(sum);
		sc2.close();
	}

}
