package javaProject.Lesson28;

import java.util.*;
import java.io.*;

public class Lesson28_project {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson28/Switches.txt"));
		int min = -1;
		int[] text = new int[1000];
		while (sc.hasNext()) {
			text[++min] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i <= min; i++) {
			System.out.println("Switch status for data value " + text[i] + ":");
			for (int j = 0; j <= 7; j++) {
				System.out.printf("Switch sw%d is \"", j + 56);
				if (((text[i]) & (int) Math.pow(2, j)) == ((int) Math.pow(2, j))) {
					System.out.println("on\"");
				} else {
					System.out.println("off\"");
				}
				
			}
			System.out.println();
		}

	}

}
