package Iniciante;

import java.util.Scanner;

public class Program_1866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int n2 = sc.nextInt();
			int X = 0;
			for (int j = 0; j < n2; j++) {
				if (j % 2 == 0)
					X++;
				else
					X--;
			}
			System.out.println(X);
		}
		sc.close();
	}
}
