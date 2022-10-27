package javaProject.Lesson24;

import java.util.*;
import java.io.*;

public class Lesson24_project {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson24/NerdData.txt"));
		int min = -1;
		String[] text = new String[1000];
		while (sc.hasNext()) {
			text[++min] = sc.nextLine();
		}
		sc.close();
		for (int i = 0; i <= min; i++) {
			StringTokenizer n = new StringTokenizer(text[i]);
			if (n.nextToken().equals("The")) {
				System.out.println(text[i]);
			}
		}
				
	}

}
