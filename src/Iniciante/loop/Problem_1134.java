package Iniciante.loop;

import java.util.Scanner;

public class Problem_1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtdGasolina = 0, qtdEtanol = 0, qtdDisiel = 0;

		int codigo = sc.nextInt();

		while (codigo != 4) {
			switch (codigo) {
			case 1:
				qtdEtanol++;
				break;
			case 2:
				qtdGasolina++;
				break;
			case 3:
				qtdDisiel++;
				break;
			}
			codigo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", qtdEtanol);
		System.out.printf("Gasolina: %d\n", qtdGasolina);
		System.out.printf("Diesel: %d\n", qtdDisiel);
		sc.close();
	}

}
