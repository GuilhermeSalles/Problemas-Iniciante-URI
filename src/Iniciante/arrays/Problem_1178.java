package Iniciante.arrays;

import java.util.Scanner;

public class Problem_1178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] vet = new double[100];

		vet[0] = sc.nextDouble();

		String formatVet = String.format("%.4f", vet[0]);

		System.out.println("N[" + (0) + "] = " + formatVet);

		for (int i = 1; i < vet.length; i++) {
			vet[i] = vet[i - 1] / 2;

			String format = String.format("%.4f", vet[i]);

			System.out.println("N[" + (i) + "] = " + format);
		}

		sc.close();
	}
}
