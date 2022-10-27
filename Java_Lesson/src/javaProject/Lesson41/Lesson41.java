package javaProject.Lesson41;

public class Lesson41 {

	public static void main(String[] args) {

		int[] theArray = { 4, 2, 5, 1, 3, 18, 0, 9, 6, 13, 16, 7, 97, 33, 63, 47, 37, 18, 36, 39, 68, 44, 75 };
//		BubbleSort(theArray);
//		SelectionSort(theArray);
//		InsertionSort(theArray);
//		QuickSort(theArray, 0, theArray.length - 1);
		MergeSort(theArray, 0, theArray.length - 1);
		for (int j = 0; j < theArray.length; j++) {
			System.out.print(theArray[j] + " ");
		}
		System.out.println();

	}

	public static void BubbleSort(int[] a) {
		boolean loop;
		do {
			loop = false;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					// swap
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

					loop = true;
				}
			}
		} while (loop); // VERY SLOW
	}

	public static void SelectionSort(int[] a) {
		int min, minIndex;
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			minIndex = i;
			for (int j = i; j < a.length; ++j) {
				if (a[j] < min) {
					min = a[j];
					minIndex = j;
				}
			}
			a[minIndex] = a[i];
			a[i] = min;
		}
	}

	public static void InsertionSort(int a[]) {
		int itemToInsert, j;
		boolean b;
		for (int k = 1; k < a.length; k++) {
			itemToInsert = a[k];
			j = k - 1;
			b = true;
			while ((j >= 0) && b) {
				if (itemToInsert < a[j]) {
					a[j + 1] = a[j];
					j--;
					if (j == -1)
						a[0] = itemToInsert;
				} else {
					b = false;
					a[j + 1] = itemToInsert;
				}
			}
		}
	}

	public static void QuickSort(int a[], int left, int right) {
		if (left >= right)
			return;
		int k = left;
		int j = right;
		int pivotValue = a[(left + right) / 2];
		while (k < j) {
			while (a[k] < pivotValue) {
				k++;
			}

			while (pivotValue < a[j]) {
				j--;
			}
			if (k <= j) {
				int temp = a[k];
				a[k] = a[j];
				a[j] = temp;
				k++;
				j--;
			}
		}
		QuickSort(a, left, j);
		QuickSort(a, k, right);
	}

	public static void MergeSort(int a[], int left, int right) {
		if (right == left)
			return;
		int middle = (left + right) / 2;
		MergeSort(a, left, middle);
		MergeSort(a, middle + 1, right);
		merge(a, left, middle, right);
	}

	private static void merge(int a[], int left, int middle, int right) {
		int tmpArray[] = new int[right - left + 1];
		int index1 = left;
		int index2 = middle + 1;
		int index = 0;
		while (index1 <= middle && index2 <= right) {
			if (a[index1] < a[index2]) {
				tmpArray[index] = a[index1];
				index1++;
			} else {
				tmpArray[index] = a[index2];
				index2++;
			}
			index++;

		}
		while (index1 <= middle) {
			tmpArray[index] = a[index1];
			index1++;
			index++;
		}
		while (index2 <= right) {
			tmpArray[index] = a[index2];
			index2++;
			index++;
		}
		for (index = 0; index < tmpArray.length; index++) {
			a[left + index] = tmpArray[index];
		}
	}

}
