package Iniciante.arrays;

import java.util.Scanner;

public class Problem_1172 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] <= 0) {
				vet[i] = 1;
			}
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("X[" + i + "] = " + vet[i]);
		}

		sc.close();
	}

}
