package javaProject.Lesson47;

import java.io.*;
import java.util.*;

public class Lesson47_project4 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(
				new File("/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson47/StudentData.txt"));
		Map<String, ArrayList<String>> map = new TreeMap<>();
		while (sc.hasNext()) {
			String key = sc.next();
			String value = sc.next();
			if (map.containsKey(key)) {
				ArrayList<String> arr = map.get(key);
				arr.add(value);
				Collections.sort(arr);
				map.replace(key, arr);
			} else {
				ArrayList<String> arr = new ArrayList<>();
				arr.add(value);
				map.put(key, arr);
			}

		}

		Set<String> set = new TreeSet<>();
		set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			System.out.print(temp + "(");
			Iterator<String> itr2 = map.get(temp).iterator();
			String temp2 = new String();
			while (itr2.hasNext()) {
				temp2 += itr2.next() + ", ";
			}
			StringBuffer s = new StringBuffer(temp2);
			s.delete(temp2.length() - 2, temp2.length());
			System.out.print(s);
			System.out.print(")\n");
		}
		sc.close();
	}

}
