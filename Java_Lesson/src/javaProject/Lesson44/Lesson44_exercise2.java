package javaProject.Lesson44;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson44_exercise2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		Iterator<String> iter = list.iterator();
		String obj = iter.next(); // 1
		System.out.println(list + obj);
		iter.remove();
		System.out.println(list);
		obj = iter.next();
		System.out.println(obj); // 2
		boolean state = iter.hasNext();
		System.out.println(state); // true
//		for (int i = 1; i <= 3; i++) {
//			iter.next();
//		}
	}

}
