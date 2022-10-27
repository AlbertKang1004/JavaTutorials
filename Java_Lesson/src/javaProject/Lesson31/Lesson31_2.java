package javaProject.Lesson31;

public class Lesson31_2 {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer();
		for (int j = 1; j <= 8; j++) {
			for (int k = 1; k <= j; k++) {
				sb.append("X");
			}
			sb.append('\n');
		}
		String s = sb.toString();
		System.out.print(s);
	}

}
