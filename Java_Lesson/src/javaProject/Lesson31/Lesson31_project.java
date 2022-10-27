package javaProject.Lesson31;

public class Lesson31_project {
	public static void main(String args[]) {
		String t1 = cat(68, 108);
		System.out.println(t1);
		
		String t2 = cat(35, 59);
		System.out.println(t2);
	}
	
	private static String cat(int start, int end) {
		StringBuffer sb = new StringBuffer();
		for (int i = start; i <= end; i++) {
			sb.append((char) i);
		}
		return sb.toString();
	}
}
