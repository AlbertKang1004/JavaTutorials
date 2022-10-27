package javaProject.Lesson19;

public class Lesson19_problems {

	public static int nerdStuff(int[] cb) {
		int counter = 0;
		for (int k = 0; k < cb.length; ++k)
			if (cb[k] < 3)
				++counter;
		return counter;
	}

	public static void testLoop(int[] a) {
		for (int j = 0; j < a.length; ++j)
			++a[j];
	}

	public static void main(String[] args) {
		int[] gem = { -102, 14, 5, 100, -100 };
		System.out.println(gem[1]); // 14

		int[] stk = { 1, 5, 19, 2, 20, 180 };
		int g = nerdStuff(stk) + 1;
		System.out.println(g); // 3

//		int[] a = new int[] { 1, 2, 3, 4 };
//		int[10] b={1,2,3,4};
//		int c={1,2,3,4}; 
//		int[] d=new int{1,2,3,4}; 

		int arr[] = { 15, 16, 17, 19, 5 };
		testLoop(arr);
		System.out.println(arr[3]);

		String s1 = "abcdefghijk";
		char[] x = s1.toCharArray();
		String s2 = "mnopqrstuvw";
		char[] y = s2.toCharArray();
		int vv[] = { 0, 1, 0, 1 };
		for (int j = 0; j < vv.length; j++) {
			switch (vv[j]) {
			case 0:
				System.out.print(x[j]);
				break;
			case 1:
				System.out.print(y[j + 1]);
			}
		}
		System.out.println();
		// aocq
		int a[] = { 0, 1, 2, 3 };
		int b[] = a;
		int sum = 0;
		for (int j = 0; j < 3; j++) {
			sum += (a[j + 1] * b[j]) + (a[j] * b[j + 1]);
		}
		System.out.println(sum); // 16

		int[] z1 = { 2, 3, 4, 5, 6 };
		int[] z2 = { 1, 2, 1, 2, 1 };
		double d = 0;
		for (int j = 0; j < 3; j++) {
			d = d + Math.pow(z1[j + 1], 2) + Math.pow(z2[j], 2);
		}
		System.out.println(d); // 56.0

		int j, src = 2, des = 3, hm = 2;
		int[] sa = { 100, 200, 300, 400, 500 };
		int[] da = { 40, 50, 60, 70, 80 };
		System.arraycopy(sa, src, da, des, hm);
		for (j = 0; j < da.length; j++)
			System.out.print(da[j]); // 405060300400
		System.out.println();

		int[] aleve = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 6;
		n = aleve[aleve[n] / 2];
		System.out.print(aleve[n] % 2); // 1
		System.out.println();

	}

	@SuppressWarnings("unused")
	public static double getProduct() {
		double d[] = { 100, -25, 16, 27, -102 };
		double product = 1;

		return product;
	}
}
