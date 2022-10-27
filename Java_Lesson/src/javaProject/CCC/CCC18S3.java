package javaProject.CCC;

import java.util.Scanner;

public class CCC18S3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[][] map = new String[N][M];
		sc.nextLine();
		sc.useDelimiter("");
		for (int i = 0 ; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.next();
			}
			sc.nextLine();
		}
		sc.close();
		for (int i = 0 ; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	

}
