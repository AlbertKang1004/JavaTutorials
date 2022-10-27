package javaProject.Lesson45;

public class Lesson45_exercise {

	public static void main(String[] args) {
		PoochyPavy mpp = new PoochyPavy(30);
		PoochyPavy vvv = new PoochyPavy(5);
		System.out.println(mpp.compareTo(vvv)); // 136

		String s1 = "larry";
		String s2 = "curly";
		if (s1.compareTo(s2) > 0) System.out.println("ABC"); // This
		if (s2.compareTo(s1) == 0) System.out.println("XYZ");
		if (s1.compareTo(s2) < 0) System.out.println("Yes"); 
		
		Integer p = 3;
		Integer q = 2;
		
		if (p.compareTo(q) > 0) System.out.println("p > q");
		if (p.compareTo(q) == 0) System.out.println("p = q");
		if (p.compareTo(q) < 0) System.out.println("p < q");
		
		String a = "a";
		String A = "A";
		System.out.println(a.compareTo(A)); 
	}

//	public static void doSomething(Comparable ob, Comparable job) {
//		int s = ob.compareTo(job);
//	}
}
