package Iniciante.selecao;

import java.util.Scanner;

public class Problem_1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ID, COUNT;

		ID = sc.nextInt();
		COUNT = sc.nextInt();

		if (ID == 1) {
			System.out.printf("Total: R$ %.2f\n", COUNT * 4.00);
		}
		if (ID == 2) {
			System.out.printf("Total: R$ %.2f\n", COUNT * 4.50);
		}
		if (ID == 3) {
			System.out.printf("Total: R$ %.2f\n", COUNT * 5.00);
		}
		if (ID == 4) {
			System.out.printf("Total: R$ %.2f\n", COUNT * 2.00);
		}
		if (ID == 5) {
			System.out.printf("Total: R$ %.2f\n", COUNT * 1.50);
		}
		sc.close();
	}

}
