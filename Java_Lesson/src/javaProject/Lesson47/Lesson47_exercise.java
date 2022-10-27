package javaProject.Lesson47;
import java.util.*;
import java.util.Map.Entry;

public class Lesson47_exercise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Sally", "blue");
		System.out.println(map);
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> mp = set.iterator();
		
		Map<String, Integer> hoover = new HashMap<>();
		System.out.println(hoover.size());
		
	}

}
