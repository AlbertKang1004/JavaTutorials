package javaProject.Lesson46;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class Lesson46_project2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson46/input.txt"));
		int scores = sc.nextInt();
		int disc = sc.nextInt();
		Set<String> scores_accepted = new TreeSet<>();
		Set<String> disc_detected = new TreeSet<>();
		for (int i = 0; i < scores; i++) {
			String temp = sc.next();
			sc.next(); // skip subject
			if (sc.nextInt() >= 89) {
				scores_accepted.add(temp);
			}
		}
		for (int j = 0; j < disc; j++) {
			disc_detected.add(sc.next());
			sc.next(); // skip month
			sc.nextInt(); // skip day
		}
		sc.close();
		
		scores_accepted.removeAll(disc_detected); // remove who got detention
		for (String s : scores_accepted) {
			System.out.println(s);
		}

	}

}
