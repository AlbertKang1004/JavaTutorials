package javaProject.Lesson17;

public class Lesson17 {

	public static void main(String[] args) {
		String s = new String("The Dukes of Hazzard");
		
		System.out.println(s.compareTo("coat room")); // negative 
		System.out.println(s.compareTo("The Dukes of Hazzard")); // 0
		System.out.println(s.compareTo("Vanadium")); // negative
		
		System.out.println(s.compareToIgnoreCase("coat room")); // positive 
		System.out.println(s.compareToIgnoreCase("The Dukes of Hazzard")); // 0
		System.out.println(s.compareToIgnoreCase("Vanadium")); // negative
		
		System.out.println(s.indexOf("Hazzard")); 
		System.out.println(s.indexOf("The", 9)); // -1 : Cannot find
		
		System.out.println(s.indexOf('D'));
		System.out.println(s.indexOf('D', 5));
		
		System.out.println(s.indexOf(68));
		System.out.println(s.indexOf(68, 5));
		
		System.out.println(s.lastIndexOf('a')); // finds the last 'a'
		
		String t = new String("\tTHE BOSS THE POWER");
		System.out.println(t.replace('H', 'I'));
		System.out.println(t.replace("THE", "NO"));
		
		System.out.println(t.trim());
		
		System.out.println(t.contains("BOSS")); // true
		System.out.println(t.startsWith("THE")); // false (starts with \t)
		
	}

}
