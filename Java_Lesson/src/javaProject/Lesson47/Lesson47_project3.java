package javaProject.Lesson47;

import java.util.*;
import java.io.*;

public class Lesson47_project3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson47/Words.txt"));
		sc.useDelimiter(", ");
		Map<String, Integer> occ = new TreeMap<>();
		while (sc.hasNext()) {
			String temp = sc.next();
			if (occ.containsKey(temp)) {
				occ.replace(temp, occ.get(temp) + 1);
			} else {
				occ.put(temp, 1);
			}
		}
		Set<String> set = occ.keySet();
		Iterator<String> itr = set.iterator();
		System.out.printf("%s\t\t%10s\n", "Words", "Frequency");
		while (itr.hasNext()) {
			String temp = itr.next();
			System.out.printf("%s\t\t%10s\n", temp, starPrint(occ.get(temp)));
		}
	}

	public static String starPrint(int j) {
		String s = "";
		for (int i = 0; i < j; i++) {
			s = s + " *";
		}
		return s;
	}

}
