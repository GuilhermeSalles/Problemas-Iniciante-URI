package Iniciante.loop;

import java.util.Scanner;

public class Problem_1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int p = (int) Math.pow(i, 2);
			int p2 = p * i;
			System.out.println(i + " " + p + " " + p2);
		}
		sc.close();
	}
}
