package javaProject.Lesson55;

import java.util.*;
import java.io.*;

public class Lesson55_project2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson55/HeapData.txt"));
		ArrayList<String> data = new ArrayList<>();
		while (sc.hasNextLine()) {
			data.add(sc.nextLine());
		}
		int treeLevel = (int) (Math.log(data.size()) / Math.log(2)) + 1;
		int count = 0;
		for (int i = 0; i < treeLevel; i++) {
			int space = (int) Math.pow(2, treeLevel - 1 - i) - 1;
			printSpace(space);
			if (i == 0) {
				System.out.print(data.get(0));
				count++;
			} else {
				for (double j = 0; j < Math.pow(2, i); j++) {
					if (count < data.size()) {
						System.out.print(data.get(count));
						printSpace((int) Math.pow(2, treeLevel - i) - 1);
					}
					count++;
				}
			}
			System.out.println();
			System.out.println();

		}
	}

	public static void printSpace(int a) {
		while (a > 0) {
			System.out.print(" ");
			a--;
		}
	}

}
