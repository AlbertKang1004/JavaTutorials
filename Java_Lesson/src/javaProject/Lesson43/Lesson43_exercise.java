package javaProject.Lesson43;

import java.util.*;

public class Lesson43_exercise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<String> alst = new ArrayList<>();

//		List a = new ArrayList();
		List<Integer> b = new ArrayList<Integer>();
		b.add(5, 0);

		int gh = b.get(22);

		int kd = b.get(101);
		b.set(101, 17);

		b.add(59, 127);

		b.clear();

		String myString = new String(String.valueOf(b.get(99)));
	}

}
