package javaProject.Lesson47;

import java.io.*;
import java.util.*;

public class Lesson47_project2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson47/Data.txt"));
		int line_num = sc.nextInt();

		Map<String, String> code = new HashMap<>();
		for (int i = 0; i < line_num; i++) {
			sc.useDelimiter("[=\\n]");
			String key = sc.next();
			String value = sc.next();
			code.put(key, value);
		}
		sc.useDelimiter("");
		sc.nextLine();
		String str = sc.nextLine();
		Scanner sc2 = new Scanner(str);
		sc2.useDelimiter(" ");
		while (sc2.hasNext()) {
			String temp = sc2.next();
			if (code.containsKey(temp))
				System.out.print(code.get(temp) + " ");
			else 
				System.out.print(temp + " ");
		}
		sc2.close();
	}

}
