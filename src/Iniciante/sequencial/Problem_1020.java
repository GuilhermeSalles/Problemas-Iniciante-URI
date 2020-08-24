package Iniciante.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Problem_1020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorInfo = sc.nextDouble();
		int valor = 0;

		System.out.println("NOTAS:");
		valor = (int) valorInfo / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		valorInfo = valorInfo % 100.0;

		valor = (int) valorInfo / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		valorInfo = valorInfo % 50.0;

		valor = (int) valorInfo / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		valorInfo = valorInfo % 20.0;

		valor = (int) valorInfo / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		valorInfo = valorInfo % 10.0;

		valor = (int) valorInfo / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		valorInfo = valorInfo % 5.0;

		valor = (int) valorInfo / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		valorInfo = valorInfo % 2.0;

		valorInfo = valorInfo * 100;

		System.out.println("MOEDAS:");

		valor = (int) valorInfo / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		valorInfo = valorInfo % 100.0;

		valor = (int) valorInfo / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		valorInfo = valorInfo % 50.0;

		valor = (int) valorInfo / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		valorInfo = valorInfo % 25.0;

		valor = (int) valorInfo / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		valorInfo = valorInfo % 10.0;

		valor = (int) valorInfo / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		valorInfo = valorInfo % 5.0;

		valor = (int) valorInfo / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		valorInfo = valorInfo % 1.0;

		sc.close();

	}

}
