package javaProject.Lesson23;
import java.util.*;

public class Lesson23_exercise {

	public static void main(String[] args) {
		String zulu = "33+452+123+452";
		StringTokenizer st = new StringTokenizer(zulu, "+");
		while (st.hasMoreTokens())
			System.out.print(st.nextToken() + " ");
		
		System.out.println();
		
		StringTokenizer t = new StringTokenizer("Hello there good buddy");
		String m = t.nextToken();
		System.out.println(m + ">>>" + t.countTokens() + " tokens left.");
		
		if (t.countTokens() > 0) {}
		
		StringTokenizer g = new StringTokenizer("Rumplestillskin", "me");
		System.out.println(g.nextToken()); // Ru
		System.out.println(g.nextToken("s")); // mple
		
		System.out.println(SpecialToken.thirdToken("Hu am fut ai?"));
		
		StringTokenizer gt = new StringTokenizer("Humpty Dumpty", "pu\n\t");
		System.out.println(gt.countTokens());
		
		String radString = gt.nextToken();
		System.out.println(gt.nextToken() + radString);
		
		System.out.println(gt.countTokens()); // 3
		
		while (gt.hasMoreTokens()) {
			System.out.println(gt.nextToken());
		}
		
		StringTokenizer tux = new StringTokenizer("Ignoramus");
		System.out.println(tux.countTokens()); // 1
		System.out.println(tux.nextToken()); // Ignoramus
//		System.out.println(tux.nextToken()); // Exception
		
	}

}
