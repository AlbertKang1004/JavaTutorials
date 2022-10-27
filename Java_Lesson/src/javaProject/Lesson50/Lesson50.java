package javaProject.Lesson50;

import java.util.*;

public class Lesson50 {

	public static void main(String[] args) {
		LinkedList<String> newList = new LinkedList<>();
		newList.add("String");
		newList.add("String b");
		newList.add("String c");
		newList.add(1, "Middle");
		System.out.println(newList.toString());

		newList.addFirst("Start");
		newList.addLast("End");
		System.out.println("\n" + newList.toString());

		System.out.println("\ncontains(String): " + newList.contains("String"));
		System.out.println("get(1): " + newList.get(1));
		System.out.println("getFirst(): " + newList.getFirst());
		System.out.println("getLast(): " + newList.getLast());

		System.out.println("\nindexOf(\"Middle\"): " + newList.indexOf("Middle"));
		System.out.println("isEmpty(): " + newList.isEmpty());
		newList.add("Middle");
		System.out.println("\nlastIndexOf(\"Middle\"): " + newList.lastIndexOf("Middle"));
		System.out.println("\n" + newList.toString());
		
		newList.remove(3);
		System.out.println("\n" + newList.toString());
		
		newList.remove("Middle");
		System.out.println("\n" + newList.toString());
		
		newList.removeFirst();
		newList.removeLast();
		System.out.println("\n" + newList.toString());
		
		System.out.println("size(): " + newList.size());
		
	}
}
