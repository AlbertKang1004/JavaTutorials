package javaProject.Lesson48;

import java.util.*;

public class Lesson48_project2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		long startTime = System.nanoTime();
		int d = 1;
		Set<Integer> l = new HashSet<>();
		do {
			if (n % d == 0) {
				l.add(d);
				l.add(n / d);
			}
			d++;
		} while (d <= Math.sqrt(n));
		List<Integer> l2 = new ArrayList<>();
		l2.addAll(l);
		Collections.sort(l2);
		Iterator<Integer> itr = l2.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		System.out.println();
		System.out.printf("Your algorithm took %fs to run.\n", (elapsedTime) / 1_000_000_000.0);
		// 0.004440s 0.004550s 0.004547s 0.004302s 0.004493s  
		// AVG: 0.0044664s
		// 715.5x faster
	}

}
