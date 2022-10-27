package javaProject.Lesson24;

import java.io.*;
import java.util.*;

public class Lesson24 {

	public static void main(String[] args) throws IOException {
		Scanner sf = new Scanner(new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson24/MyData.in"));
		int maxIndex = -1;
		String text[] = new String[1000];
		
		while(sf.hasNext()) 
		{
			text[++maxIndex] = sf.nextLine();
		}
		sf.close();
		
		for (int j = 0; j <= maxIndex; j++) {
			System.out.println(text[j]);
		}
	}

}
