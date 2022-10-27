package javaProject.Lesson55;

import java.util.*;
import java.io.*;

public class Lesson55_project {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson55/HeapData.txt"));
		ArrayList<String> data = new ArrayList<>();
		while (sc.hasNextLine()) {
			data.add(sc.nextLine());
		}

		for (int i = 2; i <= data.size() + 1; i++) {
			if ((Math.log(i) / Math.log(2)) % 1.0 == 0.0) {
				System.out.print(data.get(i - 2) + "\n");
			} else {
				System.out.print(data.get(i - 2) + " ");
			}
		}

	}
}
