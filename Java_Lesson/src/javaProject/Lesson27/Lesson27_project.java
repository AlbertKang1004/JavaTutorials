package javaProject.Lesson27;

import java.io.*;
import java.util.*;
import java.text.*;

public class Lesson27_project {

	public static void main(String[] args) throws IOException {
		NumberFormat fmt = NumberFormat.getNumberInstance();
		fmt.setMaximumFractionDigits(3);
		fmt.setMinimumFractionDigits(3);

		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson27/test.txt"));
		int maxIndex = -1;
		String[] text = new String[1000];
		while (sc.hasNext()) {
			text[++maxIndex] = sc.nextLine();
		}
		sc.close();

		for (int j = 0; j <= maxIndex; j++) {
			StringTokenizer st = new StringTokenizer(text[j]);
			double count = 0, sum = 0;
			while (st.hasMoreTokens()) {
				sum += Double.parseDouble(st.nextToken());
				count++;
			}
			System.out.printf("For Competitor #%d, the average is %06.4f\n", j + 1, sum / count);
		}
	}

}
