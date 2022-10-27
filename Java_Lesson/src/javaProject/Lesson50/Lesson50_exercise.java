package javaProject.Lesson50;

import java.util.*;

public class Lesson50_exercise {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("Black");
		st.push("Beard");
		String str1 = (String) st.peek(); 	// [Beard] Black
		st.push("the");						// [the] Beard Black
		st.push(str1);						// [Beard] the Beard Black
		String str2 = (String) st.pop();		// [the] Beard Black
		st.push("Pirate");					// [Pirate] the Beard Black
		System.out.print(str2);			// Beard
		while (!st.isEmpty()) {
			System.out.print((String) st.pop() + " ");
		}

	}

}
