package javaProject.Lesson31;

public class StrBuf {
	public static StringBuffer sbStuff(StringBuffer sb) {
		for (int j = 0; j < sb.length(); j++)
			if (sb.charAt(j) >= 'q' - 1)
				sb.setCharAt(j, 'x');
		return sb;
	}
}
