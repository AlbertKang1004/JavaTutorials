package javaProject.Lesson15;

public class Trail {
	public int x, y;
	public String s;

	public String met() {
		return Integer.toString(x * y, 16);
	}

	public Trail(String str) {
		x = 10;
		y = 10;
		s = str;
	}

}
