package Matemática;

import java.util.Scanner;

public class Problem_1028 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas vezes? ");
		int N = sc.nextInt();
		System.out.println("=============");
		for (int i = 0; i < N; i++) {
			System.out.print("A: ");
			int a = sc.nextInt();
			System.out.print("B: ");
			int b = sc.nextInt();
			
			int temp;
			if(a < b) {
				temp = a;
				a = b;
				b = temp;
			}

			System.out.println(mdc(a, b));
			System.out.println("===============");
		}
		sc.close();

	}

	public static int mdc(int a, int b) {
		int resto = 0;
		while (a % b != 0) {
			resto = a;
			a = b;
			b = resto % a;
		}
		return b;
	}
}
