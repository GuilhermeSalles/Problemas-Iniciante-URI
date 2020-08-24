package Iniciante.loop;

import java.util.Scanner;

public class Problem_1074 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int X = 0;
		
		for (int i = 1; i <= n; i++) {
			X = sc.nextInt();

			if (X == 0) {
				System.out.println("NULL");
			} else {
				if (X % 2 == 0) {
					System.out.print("EVEN ");
				} else {
					System.out.print("ODD ");
				}
				if (X > 0) {
					System.out.println("POSITIVE");
				} else {
					System.out.println("NEGATIVE");
				}
			}
		}

		sc.close();
	}

}
