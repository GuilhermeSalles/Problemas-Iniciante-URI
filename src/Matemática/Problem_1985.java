package Matemática;

import java.util.Scanner;

public class Problem_1985 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			int nP = sc.nextInt();
			int qtdP = sc.nextInt();

			switch (nP) {
			case 1001:
				sum += (qtdP * 1.50);
				break;

			case 1002:
				sum += (qtdP * 2.50);
				break;

			case 1003:
				sum += (qtdP * 3.50);
				break;

			case 1004:
				sum += (qtdP * 4.50);
				break;

			case 1005:
				sum += (qtdP * 5.50);
				break;
			}
		}
		System.out.println(String.format("%.2f", sum));
		sc.close();
	}
}
