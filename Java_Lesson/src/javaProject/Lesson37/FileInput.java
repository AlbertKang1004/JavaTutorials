package javaProject.Lesson37;

import java.io.*;
import java.util.Scanner;

public class FileInput {

	public static void readTheFile(String fileName) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson37/" + fileName));
		int max = -1;
		String[] text = new String[1000];
		
		while(sc.hasNext()) {
			text[++max] = sc.nextLine();
		}
		sc.close();
		
		for (int j = 0; j <= max; j++) {
			System.out.println(text[j]);
		}
	}

}
