package javaProject.Lesson47;

import java.util.*;
import java.util.Map.Entry;

public class Lesson47 {

	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("Mary", 15); // Mary is 15 years old
		myMap.put("James", 12);
		myMap.put("Elian", 22);
		myMap.put("Millan", 14);
		myMap.put("Quincy", 16);
		Set<String> ks = myMap.keySet();
		Iterator<String> iter = ks.iterator();
		while (iter.hasNext()) {
			Object key = iter.next();
			Object value = myMap.get(key);
			System.out.println((String) key + "--->" + (Integer) value);
		}

		Map<String, Integer> myMap2 = new TreeMap<>();
		myMap2.put("Mary", 15);
		myMap2.put("James", 12);
		myMap2.put("Elian", 22);
		myMap2.put("Millan", 14);
		myMap2.put("Quincy", 16);
		Set<Entry<String, Integer>> es = myMap2.entrySet();
		Iterator<Entry<String, Integer>> iter2 = es.iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next().getValue());
		}
		
	}
}
