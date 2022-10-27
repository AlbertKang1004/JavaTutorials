package javaProject.Lesson36;

public class B extends A {
	public B(int x, int y) {
		super(x);
		this.x = y;
	}

	public int f() {
		return x + g();
	}

	public int zorro() {
		return x + g();
	}

	public int x;
}
