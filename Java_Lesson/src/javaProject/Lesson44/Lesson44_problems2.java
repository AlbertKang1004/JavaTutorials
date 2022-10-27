package javaProject.Lesson44;

import java.util.*;

public class Lesson44_problems2 {

	public static void main(String[] args) {
		List<String> lst = new LinkedList<String>();
		String s[] = "Hello to you".split("\\s");
		for (int j = 0; j < s.length; j++) {
			lst.add(s[j]);
		}
		
		Iterator<String> itr = lst.iterator();
		for (itr.next(); itr.hasNext(); itr.next()) {
			itr.remove();
		}
		System.out.println(lst);
		
		ArrayList<Double> myList = new ArrayList<Double>();
		myList.add(101.24);
		
		Iterator<Double> itr2 = myList.iterator();
		while(itr2.hasNext()) {
			Double d = itr2.next();
			System.out.println(d);
		}
		
	}

}
