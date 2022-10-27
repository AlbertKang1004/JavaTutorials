package javaProject.Lesson35;

import java.io.*;
import java.util.*;

public class Lesson35_project2_UNFINISHED {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson35/input.txt"));

		int m1_row = 0;
		int m1_col = 0;
		int m2_row = 0;
		int m2_col = 0;

		// MATRIX #1
		if (sc.next().equals("matrix")) {
			sc.nextLine();
			while (sc.hasNext()) {
				if (sc.next().equals("row")) {
					sc.nextLine();
					while (sc.hasNext("[0123456789-]+")) {
						m1_col++;
						sc.nextLine();
					}
				}
				m1_row++;
				if (sc.next().equals("matrix")) break;
				sc.nextLine();
				
			}
		}

		// MATRIX #2
//		while (sc.hasNext()) {
//			if (sc.next().equals("matrix")) {
//				sc.nextLine();
//				if (sc.next().equals("row")) {
//					sc.nextLine();
//					while (sc.hasNext("[0123456789-]+")) {
//						m2_row++;
//						sc.nextLine();
//					}
//				}
//			}
//			sc.nextLine();
//		}

		System.out.println(m1_row);
		System.out.println(m1_col);
	}

}
