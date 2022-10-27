package javaProject.Lesson42;

import java.util.*;

public class Lesson42 {

	public static void main(String[] args) {
		List<Character> ls = new ArrayList<>();
		ls.add(0, 'z'); // z
		ls.add(1, 'y'); // z y
		ls.add(1, 'x'); // z x y
//		ls.add(5, 'p'); // ERROR
		System.out.println(ls);
		System.out.println("isEmpty(): " + ls.isEmpty()); // false
		System.out.println("size(): " + ls.size()); // 3
		System.out.println("indexOf(x): " + ls.indexOf('x')); // 1
		System.out.println("contains(x): " + ls.contains('x')); // true
		System.out.println("indexOf(j): " + ls.indexOf('j')); // -1
		System.out.println("contains(j): " + ls.contains('j')); // false
		System.out.println("get(1): " + ls.get(1)); // 1
//		System.out.println("get(3): " + ls.get(3)); // ERROR
		ls.set(2, 'e'); // z x e
		ls.remove(0); // x e
//		ls.remove(2); // ERROR
		ls.remove(1); // x
		ls.add('x'); // x x 
		System.out.println(ls);
		System.out.println("lastIndexOf(x): " + ls.lastIndexOf('x')); // 1
		ls.clear();
		System.out.println("isEmpty(): " + ls.isEmpty());
//		ls.remove(0); // ERROR
//		ls.set(0, 'z'); // ERROR CAN'T ADD MORE
		System.out.println(ls);
		
	}

	public static void displayState(List<Character> list) {
	}

}
