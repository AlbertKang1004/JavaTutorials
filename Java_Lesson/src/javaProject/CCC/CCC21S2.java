package javaProject.CCC;

import java.util.*;

public class CCC21S2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int K = sc.nextInt();

		boolean[] table_row = new boolean[M];
		boolean[] table_col = new boolean[N];
		for (int i = 0; i < K; i++) {
			switch (sc.next()) {
			case "R":
				int r_num = sc.nextInt();
				if (table_row[r_num - 1] == true)
					table_row[r_num - 1] = false;
				else
					table_row[r_num - 1] = true;
				break;
			case "C":

				int c_num = sc.nextInt();
				if (table_col[c_num - 1] == true)
					table_col[c_num - 1] = false;
				else
					table_col[c_num - 1] = true;
				break;
			}
		}

		sc.close();
		int count = 0;
		for (int i = 0; i < table_row.length; i++) {
			for (int j = 0; j < table_col.length; j++) {
				if (table_row[i] ^ table_col[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
