package javaProject.Lesson24;

import java.util.*;
import java.io.*;

public class Lesson24_exercise {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson24/DaffyDuck.txt"));
		int count = 0;
		while (sc.hasNext()) {
			count++;
			sc.nextLine();
		}
		sc.close();
		
		
		System.out.println(count);
	}

}
