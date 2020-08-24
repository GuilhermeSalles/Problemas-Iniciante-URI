package Iniciante.loop;

import java.util.Scanner;

public class Problem_1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num, count = 0;
		for (int i = 1; i <= 5; i++) {
			num = sc.nextDouble();
			if (num % 2 == 0) {
				count += 1;
			}
		}

		System.out.printf("%.0f valores pares%n", count);

		sc.close();
	}

}
