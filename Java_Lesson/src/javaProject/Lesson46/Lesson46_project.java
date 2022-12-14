package javaProject.Lesson46;
import java.util.*;

public class Lesson46_project {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");
		
		Set<String> s2 = new HashSet<>();
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");
		
//		s1.retainAll(s2); // Intersection of s1 and s2
		s1.addAll(s2); // Combination of s1 and s2
		Iterator<String> iter1 = s1.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
	}

}
