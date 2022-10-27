package javaProject.Lesson19;

import java.util.Arrays;

public class Lesson19_project2 {

	public static void main(String[] args) {
		String[] ascend = { "Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman" };
		String[] descend = new String[ascend.length];
//		System.arraycopy(descend, 0, ascend, 0, ascend.length);
		Arrays.sort(ascend);
		for (int i = 0; i < ascend.length; i++) {
			descend[i] = ascend[ascend.length - 1 - i];
		}
		
		System.out.println("Ascend\tDescend\n");
		
		for (int i = 0; i < ascend.length ; i++) {
			System.out.println(ascend[i] + "\t" + descend[i]);
		}

	}

}
