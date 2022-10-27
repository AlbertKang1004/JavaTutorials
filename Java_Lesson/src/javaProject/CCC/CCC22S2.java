package javaProject.CCC;

import java.util.*;

public class CCC22S2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String[]> together = new ArrayList<>();
		ArrayList<String[]> alone = new ArrayList<>();
		ArrayList<String[]> check = new ArrayList<>();
		int X = sc.nextInt();
		for (int i = 0; i < X; i++) {
			String[] string = new String[2];
			string[0] = sc.next();
			string[1] = sc.next();
			together.add(string);
			sc.nextLine();
		}

		int Y = sc.nextInt();
		for (int i = 0; i < Y; i++) {
			String[] string = new String[2];
			string[0] = sc.next();
			string[1] = sc.next();
			alone.add(string);
			sc.nextLine();
		}

		int G = sc.nextInt();
		for (int i = 0; i < G; i++) {
			String[] string = new String[3];
			string[0] = sc.next();
			string[1] = sc.next();
			string[2] = sc.next();
			check.add(string);
			sc.nextLine();
		}

		sc.close();

		int count = 0;
		int A = together.size();
		int B = alone.size();
		for (int i = 0; i < check.size(); i++) {
			for (int j = 0; j < A; j++) {
				// check if both are not in the same room, add 1
				if (Arrays.binarySearch(check.get(i), together.get(j)[0]) >= 0
						^ Arrays.binarySearch(check.get(i), together.get(j)[1]) >= 0) {

					count++;
					together.remove(j);
					--A;
					--j;

				}
			}
			for (int k = 0; k < B; k++) {
				// check if both are in the same room, add 1
				if (Arrays.binarySearch(check.get(i), alone.get(k)[0]) >= 0
						&& Arrays.binarySearch(check.get(i), alone.get(k)[1]) >= 0) {
					count++;
					alone.remove(k);
					--k;
					--B;
				}
			}
		}
		System.out.println(count);
	}

}