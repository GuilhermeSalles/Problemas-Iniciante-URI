package Iniciante.selecao;

import java.util.Scanner;

public class Problem_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao = 24 - (24 + inicio - fim) % 24;
		if (inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}

		sc.close();
	}

}
