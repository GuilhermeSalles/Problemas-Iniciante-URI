package Iniciante.loop;

import java.util.Scanner;

public class Problem_1101 {

	public static void main(String[] args) {

		int X, Y;

		Scanner sc = new Scanner(System.in);

		while (((X = sc.nextInt()) > 0) && ((Y = sc.nextInt()) > 0)) {

			int sum = 0;

			if (X > Y) {
				for (int i = Y; i <= X; Y++) {
					sum += Y;
					System.out.print(Y + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			} else {
				for (int i = X; i <= Y; X++) {
					sum += X;
					System.out.print(X + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			}
		}
		sc.close();
	}

}
