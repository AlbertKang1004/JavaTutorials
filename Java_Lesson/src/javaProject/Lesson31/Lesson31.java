package javaProject.Lesson31;

public class Lesson31 {

	public static void main(String[] args) {
		String myXs = "";
		for (int j = 1; j <= 8; j++) {
			for (int k = 1; k <= j; k++) {
				myXs += "X";
			}
			myXs += "\n";
		}
		System.out.println(myXs);
	}
}
