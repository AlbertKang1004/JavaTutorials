package javaProject.Lesson36;

@SuppressWarnings("unused")
public class Lurch extends Hammer {

	public void duty() {
		int x = Y;
	}

	public int rule(int d) {
		Y = d + 1;
		return Y;
	}

	private int Y = 30;
	private int x;
}
