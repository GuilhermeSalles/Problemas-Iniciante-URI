package Iniciante.loop;

import java.util.Scanner;

public class Problem_1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double idade = sc.nextDouble();
		double media = 0, cont = 0;

		while (idade > 0) {
			media += idade;
			cont++;
			idade = sc.nextDouble();
		}
		double mediaF = media / cont;
		System.out.printf("%.2f%n", mediaF);
		sc.close();
	}
}
