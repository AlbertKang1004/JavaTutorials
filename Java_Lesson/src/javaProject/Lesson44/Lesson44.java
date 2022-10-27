package javaProject.Lesson44;
import java.util.*;
public class Lesson44 {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Hi");
		ls.add("NO");
		ls.add("Way");
		ListIterator<String> itr = ls.listIterator();
		System.out.println(ls);
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		itr.remove();
		System.out.println(ls);
		System.out.println(itr.hasPrevious());
		System.out.println(itr.nextIndex());
		itr.add("HHHH");
		System.out.println(ls);
	}

}
