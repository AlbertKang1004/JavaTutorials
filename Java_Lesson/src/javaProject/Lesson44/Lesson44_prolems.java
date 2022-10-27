package javaProject.Lesson44;

import java.util.*;

public class Lesson44_prolems {

	public static void main(String[] args) {
		List<Double> dblList = new ArrayList<>(); 
		for (double d = 5; d >= 0; d--) {
			dblList.add(d);
		}
		
		traverseAndPrint(dblList);

	}
	public static void traverseAndPrint(List<Double> myList) {
		Iterator<Double> itr = myList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
	public static void doSomething (LinkedList<String> lnkLst) {
		Iterator<String> itr = lnkLst.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
