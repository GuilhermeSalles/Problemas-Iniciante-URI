package Iniciante.Ad_Hoc;

import java.util.Scanner;

public class Problem_1759 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			if (i == N)
				System.out.println("Ho!");
			else
				System.out.print("Ho ");
		}
		sc.close();
	}
}
