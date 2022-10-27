package javaProject.Lesson34;

public class Lesson34_problem2 {

	public static void main(String[] args) {
		int[] gem = { 2, 3, 4, 5, 6 };
		harvest(gem);
		for (int k = 0; k < gem.length; k++)
			System.out.print(gem[k] + " "); // 2 3 7 5 6
	}

	public static void harvest(int h[]) {
		int z[] = new int[h.length];
		for (int j = 0; j < z.length; j++)
			z[j] = j * 2; // { 0, 2, 4, 6, 8 }
		h[2] = 7; // { 2, 3, 7, 5, 6 }
		for (int k = 0; k < h.length; k++)
			System.out.print(h[k] + " "); // 2 3 7 5 6
		System.out.print("\n");
		h = z; // now reassigned
		for (int k = 0; k < h.length; k++)
			System.out.print(h[k] + " "); // 0 2 4 6 8
		System.out.print("\n");
	}

}
