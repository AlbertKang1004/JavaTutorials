package javaProject.Lesson17;

import java.util.*;

public class Lesson17_3 {

	public static void main(String[] args) {
		String ss = new String("abcxyxyabcxyabc");
		Scanner sc = new Scanner(ss);
		sc.useDelimiter("xy");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}

}
