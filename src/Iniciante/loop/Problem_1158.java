package Iniciante.loop;

import java.util.Scanner;

public class Problem_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, X, Y, j, total;
		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int sum = 0;
			X = sc.nextInt();
			Y = sc.nextInt();
			for (j = X, total = 0; total < Y; j++) {
				if (j % 2 != 0) {
					sum += j;
					total += 1;
				}
			}
			System.out.print(sum + "\n");
		}
		sc.close();
	}
}
