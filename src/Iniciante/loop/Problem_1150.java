package Iniciante.loop;

import java.util.Scanner;

public class Problem_1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Z = sc.nextInt();

		int soma = 0, cont = 0;
		while (Z <= X) {
			Z = sc.nextInt();
		}

		while (soma < Z) {
			soma += X;
			cont++;
			X++;
		}
		
		System.out.println(cont);
		sc.close();
	}
}
