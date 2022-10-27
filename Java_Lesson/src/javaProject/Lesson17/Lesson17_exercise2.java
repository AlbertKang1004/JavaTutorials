package javaProject.Lesson17;

public class Lesson17_exercise2 {

	public static void main(String[] args) {
		String xyz = "bathtub";
		String ddd = "BathTuB";
		String ccc = xyz;
		String wc = "Whooping crane";
		String s = "	\t\tGu daay, mates	\n";

		int j = xyz.compareTo(wc);
		boolean bb;
		if (j > 0)
			bb = true;
		else
			bb = false;
		System.out.println(bb); // true (b vs. W)
		// b comes after W
		
		String v = ddd.toLowerCase();
		int fg = ccc.compareTo(v);
		System.out.println(fg + 1); // 1
		
		System.out.println(ddd.compareTo(ccc)); // -32 (B vs. b)
		// B comes before b
		
		System.out.println(xyz.compareTo(ccc)); // 0
		
		System.out.println("Stupid".compareTo(ddd)); // -17 (B vs. S)
		
		System.out.println(">>>" + s.trim() + "<<<");
		// >>>Gu daay, mates<<<
		
	}

}
