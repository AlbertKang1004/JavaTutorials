package javaProject.Lesson44;

import java.util.*;

public class Lesson44_exercise3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");

		ListIterator<String> iter = al.listIterator();
		iter.next(); // 1*2 3
		iter.next(); // 1 2*3
		System.out.println(iter.next()); // 1 2[3]*
		iter.previous(); // 1 2*3
		iter.previous(); // 1*2 3
		System.out.println(iter.previous()); // *[1]2 3
		iter.next(); // 1*2 3
		iter.next(); // 1 2*3
		iter.remove(); // 1 * 3
		iter.next(); // 1 3*
		iter.set("last"); // 1 "last"*
		iter.previous(); // 1*"last"
		iter.add("middle"); // 1 "middle"*"last"
		while (iter.hasNext()) {
			iter.next();
		}
		System.out.println("Last String: " + iter.previous());

		List<String> myList = new ArrayList<>();
		Iterator<String> itr = myList.iterator();
		ListIterator<String> lstIter = myList.listIterator();
	}

}
