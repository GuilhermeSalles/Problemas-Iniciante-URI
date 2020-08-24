package Iniciante.loop;

import java.util.Scanner;

public class Problem_1094 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int quantia;
		int qtdRatos = 0, qtdCoelhos = 0, qtdSapos = 0, qtdTotal = 0;
		char tipoCobaia;
		for (int i = 0; i < n; i++) {
			quantia = sc.nextInt();
			tipoCobaia = sc.next().charAt(0);

			switch (tipoCobaia) {

			case 'C':
				qtdCoelhos += quantia;
				break;
			case 'R':
				qtdRatos += quantia;
				break;
			case 'S':
				qtdSapos += quantia;
				break;
			}
			qtdTotal += quantia;
		}

		System.out.println("Total: " + qtdTotal + " cobaias");
		System.out.println("Total de coelhos: " + qtdCoelhos);
		System.out.println("Total de ratos: " + qtdRatos);
		System.out.println("Total de sapos: " + qtdSapos);

		System.out.println(
				"Percentual de coelhos: " + String.format("%.2f", ((double) qtdCoelhos / qtdTotal) * 100) + " %");
		System.out
				.println("Percentual de ratos: " + String.format("%.2f", ((double) qtdRatos / qtdTotal) * 100) + " %");
		System.out
				.println("Percentual de sapos: " + String.format("%.2f", ((double) qtdSapos / qtdTotal) * 100) + " %");
		sc.close();
	}

}
