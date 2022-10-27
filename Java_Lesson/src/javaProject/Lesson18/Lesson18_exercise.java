package javaProject.Lesson18;

public class Lesson18_exercise {

	public static void main(String[] args) {
		double[] sgt = new double[800];

		double[] dfw = new double[21];
		System.out.println(dfw.length); // 21

		for (int i = 0; i < sgt.length; i++) {
			sgt[i] = Math.sqrt(i);
		}

		char[] cr = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(cr.length); // 5

		int[] ref = new int[100];
		int sum = 0;
		for (int i : ref) {
			sum += Math.sqrt(i);
		}
		System.out.println(sum);

		int[] adc = { 34, 56, -102, 18, 5 };
		System.out.println(adc[1]); // 56

		System.out.println(adc[3] + adc[4]); // 23

//		System.out.println(adc[5]); // ERROR

		int[] c = { 1, 2, 3, 4 };
		String ss = ">>>";
		int len = ss.length();
		for (int j = 0; j < len; j++) {
			ss += c[j];
			System.out.println(ss); 
		}
		
		int[] pg = new int[3];
		int pos = pg.length;
		for (int i = 0; i < pg.length; i++) {
			if (pg[i] < 0) {
				pos = i;
			}
		}
		System.out.println(pos); // 3
		
		String wc = "Whooping crane";
		String[] sp = wc.split("oo");
		for (int j = 0; j < sp.length; j++) {
			System.out.println(sp[j]); // Wh | ping crane
		}
		String sp1[] = "fee       fi  fo  ".split("\\s+");
		System.out.println(sp1.length); // 3
		
		String sp2[] = "One two".split("Q");
		System.out.println(sp2.length); // 1
		
		String sp3[] = "The best THERE is Barth".split("(?i)[t][h]");
		System.out.println(sp3.length);
	}

}
