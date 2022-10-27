package javaProject.Lesson17;

import java.util.*;

public class Lesson17_4 {

	public static void main(String[] args) {
		String s = "d^^*_^^ir...-t***y"; // dirty
		String answer = "";

		Scanner sc = new Scanner(s);
		sc.useDelimiter("");
		while (sc.hasNext()) {
			while (sc.hasNext("\\W|_")) {
				sc.skip("\\W|_*");
			}
			if(sc.hasNext())
				answer += sc.next();
		}
		System.out.println(answer);
		sc.close();
	}

}
