package javaProject.Lesson25;

import java.util.*;
import java.io.*;

public class Lesson25_2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson25/People.txt"));
		int maxIndex = -1;
		String[] text = new String[1000];

		while (sc.hasNext()) {
			text[++maxIndex] = sc.nextLine();
		}
		sc.close();
		
		String name[] = new String[maxIndex + 1];
		for (int j = 0; j <= maxIndex; j++) {
			Scanner sc2 = new Scanner(text[j]);
			String firstName = sc2.next();
			String lastName = sc2.next();
			name[j] = lastName + ", " + firstName;
			sc2.close();
		}
		Arrays.sort(name);
		for (String s : name) {
			System.out.println(s);
		}
	}

}
