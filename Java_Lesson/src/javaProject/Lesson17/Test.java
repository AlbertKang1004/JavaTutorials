package javaProject.Lesson17;

public class Test {
	public static void main (String args[]) {
		String s = new String("very good");
		s = s.replaceAll("ver", "sup");
		System.out.println(s);
	}
}
