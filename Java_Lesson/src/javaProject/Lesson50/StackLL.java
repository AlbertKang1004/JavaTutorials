package javaProject.Lesson50;

import java.util.LinkedList;

public class StackLL implements StackInterface {

	public StackLL() {

	}

	@Override
	public void push(double d) {
		li.add(d);
	}

	@Override
	public double pop() {
		return li.removeLast();
	}

	@Override
	public double peek() {
		return li.getLast();
	}

	@Override
	public int size() {
		return li.size();
	}

	@Override
	public void clear() {
		li.clear();
	}

	LinkedList<Double> li = new LinkedList<>();

}
