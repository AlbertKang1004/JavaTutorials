package javaProject.Lesson26;

import java.util.*;
import java.io.*;

public class Lesson26_project {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson25/StudentScores.in"));
		FileWriter fw = new FileWriter(
				"/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson26/results.txt");
		PrintWriter output = new PrintWriter(fw);
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
			output.println(name + ", average = " + Math.round(sum / count));
		}
		fw.close();
		output.close();
	}

}
