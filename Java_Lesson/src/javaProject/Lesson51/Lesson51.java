package javaProject.Lesson51;

public class Lesson51 {

	public static void main(String[] args) {
		int[] i = { -7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97 };
		System.out.println(binarySearch(i, 22, 0, i.length - 1)); // 3
		System.out.println(binarySearch(i, 89, 0, i.length - 1)); // 11
		System.out.println(binarySearch(i, -100, 0, i.length - 1)); // -1
		System.out.println(binarySearch(i, 72, 0, i.length - 1)); // -1
		System.out.println(binarySearch(i, 102, 0, i.length - 1)); // -1

	}

	private static int binarySearch(int a[], int sVal, int lb, int ub) {
		if (lb > ub)
			return -1;
		else {
			int mid = (lb + ub) / 2;
			if(a[mid] == sVal) {
				return mid;
			} else if (a[mid] < sVal) {
				return binarySearch(a, sVal, mid + 1, ub);
			} else {
				return binarySearch(a, sVal, lb, mid - 1);
			}
		}
	}

}
