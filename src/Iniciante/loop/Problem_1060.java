package Iniciante.loop;

import java.util.Scanner;

public class Problem_1060 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num, count = 0;
		for (int i = 1; i <= 6; i++) {
			num = sc.nextDouble();
			if (num >= 1) {
				count += 1;
			}
		}

		System.out.printf("%.0f valores positivos%n", count);

		sc.close();
	}

}
