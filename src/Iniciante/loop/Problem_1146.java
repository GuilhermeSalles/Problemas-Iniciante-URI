package Iniciante.loop;

import java.util.Scanner;

public class Problem_1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		while (X != 0) {
			for (int i = 1; i <= X; i++) {
				if (i == X)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
			X = sc.nextInt();
		}
		sc.close();
	}
}
