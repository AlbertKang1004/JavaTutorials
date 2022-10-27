package javaProject.Lesson25;

import java.util.*;
import java.io.*;

public class Lesson25_project {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson25/StudentScores.in"));
		int min = -1;
		String[] data = new String[1000];
		while (sc.hasNext()) {
			data[++min] = sc.nextLine();
		}
		for (int i = 0; i <= min; i++) {
			Scanner sr = new Scanner(data[i]);
			String name = sr.next();
			double sum = 0, count = 0;
			while (sr.hasNext()) {
				sum += sr.nextDouble();
				count++;
			}
			sr.close();
			System.out.println(name + ", average = " + Math.round(sum / count));
		}
	}

}
