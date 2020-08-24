package Iniciante.arrays;

import java.util.Scanner;

public class Problem_1174 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] a = new double[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 10.0)
				System.out.println("A[" + i + "] = " + a[i]);
		}

		sc.close();
	}
}
