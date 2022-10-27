package javaProject.Lesson18;

import java.util.Scanner;

public class C4 {

	public static int checkPattern(int D) {
		int hour = 0;
		int minute = 0;

		while (D >= 12 * 60) { // bigger than the half day
			D -= (12 * 60);
		}

		while (D >= 60) { // bigger than the hour
			D -= 60;
			hour++;
		}

		minute = D;

		// put each values inside the array
		int[] clock = new int[4];
		clock[0] = hour / 10;
		clock[1] = hour % 10;
		clock[2] = minute / 10;
		clock[3] = minute % 10;

		if (clock[0] == 0 && clock[1] == 0) { // 12:00 not 0:00
			clock[0] = 1;
			clock[1] = 2;
		}

		int[] diff = new int[3]; // count differences

		for (int i = 0; i < 3; i++) {
			diff[i] = clock[i + 1] - clock[i];
		}
		if (clock[0] == 0) {
			if (diff[1] == diff[2]) {
				System.out.println(clock[0]+""+clock[1]+":"+clock[2]+""+clock[3]);
				return 1;
			} else
				return 0;
		} else if (diff[0] == diff[1] && diff[1] == diff[2]) {
			System.out.println(clock[0]+""+clock[1]+":"+clock[2]+""+clock[3]);
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		int count = 0;
		int half_day = 0;
		int half_day_count = 0;

		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		sc.close();
		
		while (D >= 12 * 60) { // bigger than the half day
			D -= (12 * 60);
			half_day++;
		}
		
		for (int i = 0; i <= 12 * 60; i++) {
			half_day_count += checkPattern(i);
		}


		for (int i = 0; i <= D; i++) {
			count += checkPattern(i);
		}	

		count += (half_day_count * half_day);

		System.out.println(count);

	}

}
