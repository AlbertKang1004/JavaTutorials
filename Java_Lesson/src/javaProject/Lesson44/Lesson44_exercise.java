package javaProject.Lesson44;

import java.util.*;

public class Lesson44_exercise {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();
		al.add('x');
		al.add('y');
		al.add('z');
		al.add('j');
		ListIterator<Character> li = al.listIterator();
		System.out.println(al);
		System.out.println("hasNext(): " + li.hasNext()); // true
//		li.remove();
//		System.out.println("After remove(): " + li);
		// remove() should be after next() / previous()
		System.out.println("next(): " + li.next()); // x
		System.out.println("previous(): " + li.previous()); // x
		li.remove();
		System.out.println("After remove(): " + al);
		li.add('y');
		System.out.println("After add(y): " + al); // [y, y, z, j]
		System.out.println("next(): " + li.next()); // y
		System.out.println("next(): " + li.next()); // z
		System.out.println("next(): " + li.next()); // j
		System.out.println("hasNext(): " + li.hasNext()); // false
		System.out.println("hasPrevious(): " + li.hasPrevious()); // true
		System.out.println("previous(): " + li.previous()); // j
		li.remove();
		System.out.println("After remove(): " + al); // [y, y, z]
		System.out.println("previous(): " + li.previous()); // z
		li.set('p');
		System.out.println("After set(p): " + al); // [y, y, p]
		li.add('y');
		System.out.println("After add(y): " + al); // [y, y, y, p]
		li.add('z');
		System.out.println("After add(z): " + al); // [y, y, y, z, p]
//		li.remove();
//		System.out.println("After remove(): " + al); // [y, y, y, p]
		// 'z' disappeared so can't remove
		System.out.println("previous(): " + li.previous()); // z
		System.out.println("previous(): " + li.previous()); // y
	}

}
