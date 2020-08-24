package Iniciante.sequencial;

import java.util.Scanner;

public class Problem_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtdTotalDias = sc.nextInt();

		int qtdAnos = qtdTotalDias / 365;
		qtdTotalDias = qtdTotalDias % 365;

		int qtdMeses = qtdTotalDias / 30;
		qtdTotalDias = qtdTotalDias % 30;

		int qtdDias = qtdTotalDias;

		System.out.printf("%d ano(s)%n", qtdAnos);
		System.out.printf("%d mes(es)%n", qtdMeses);
		System.out.printf("%d dia(s)%n", qtdDias);

		sc.close();
	}

}
