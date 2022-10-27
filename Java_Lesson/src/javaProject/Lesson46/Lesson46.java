package javaProject.Lesson46;

import java.util.*;

public class Lesson46 {

	public static void main(String args[]) {
		Set<String> set = new HashSet<>();
		Set<String> set2 = new TreeSet<>();
		set.add("hi");
		set.add("everyone");
		set.add("nice");
		set.add("to");
		set.add("meet");
		set.add("you");
		
		set2.add("hi");
		set2.add("everyone");
		set2.add("nice");
		set2.add("to");
		set2.add("meet");
		set2.add("you");
		
		Iterator<String> itr = set.iterator();
		Iterator<String> itr2 = set2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); // not in alphabetical order
		}
		while (itr2.hasNext()) {
			System.out.println(itr2.next()); // in alphabetical order
		}
		System.out.println(set2.size());
		set2.removeAll(set2);
		
	}
}
