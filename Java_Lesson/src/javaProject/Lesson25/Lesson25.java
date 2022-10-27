package javaProject.Lesson25;

import java.util.*;
import java.io.*;

public class Lesson25 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson25/NumData.in"));
		int maxIndex = -1;
		String[] text = new String[1000];
		while (sc.hasNext()) {
			text[++maxIndex] = sc.nextLine();
		}
		String answer = "";
		int sum = 0;
		for (int i = 0; i <= maxIndex; i++) {
			Scanner sc2 = new Scanner(text[i]);
			sum = 0;
			answer = "";
			while (sc2.hasNext()) {
				int j = sc2.nextInt();
				answer = answer + " + " + j;
				sum = sum + j;
			}
			answer = answer + " = " + sum;
			sc2.close();
			
			System.out.println(answer.substring(3));
		}
		sc.close();
	}

}
