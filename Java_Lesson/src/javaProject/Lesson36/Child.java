package javaProject.Lesson36;

public class Child extends Parent {
	public Child(int q, int y) {
		super(q);
		this.y = y;
	}

	public int work() {
		return y + super.work();
	}

	private int y;
}
