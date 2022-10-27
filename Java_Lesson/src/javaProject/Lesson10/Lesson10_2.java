package javaProject.Lesson10;

public class Lesson10_2 {

	public static void main(String[] args) {
		int j = 5;
		String s = "";
		switch (j) {
		case 1:
		case 2:
		case 3: s = "low"; break;
		case 4:
		case 5:
		case 6: s = "high"; break;
		case 7: s = "lucky";
		}
		System.out.println(s);
	}

}
