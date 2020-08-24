package Iniciante.selecao;

import java.util.Scanner;

public class Problem_1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();

		double AA = Math.max(A, Math.max(B, C));
		double BB = 0;
		double CC = 0;
		// inicio teste max e min
		if (AA == A) {
			BB = Math.max(B, C);
			CC = Math.min(B, C);
		}
		if (AA == B) {
			BB = Math.max(A, C);
			CC = Math.min(A, C);
		}
		if (AA == C) {
			BB = Math.max(B, A);
			CC = Math.min(B, A);
		}
		// fim teste

		if (AA >= (BB + CC)) {
			System.out.print("NAO FORMA TRIANGULO\n");// se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
		} else if (Math.pow(AA, 2) > (Math.pow(BB, 2)) + (Math.pow(CC, 2))) {
			System.out.print("TRIANGULO OBTUSANGULO\n");// se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
		}
		if (Math.pow(AA, 2) == (Math.pow(BB, 2)) + (Math.pow(CC, 2))) {
			System.out.print("TRIANGULO RETANGULO\n");// se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
		}
		if (Math.pow(AA, 2) < (Math.pow(BB, 2)) + (Math.pow(CC, 2))) {
			System.out.print("TRIANGULO ACUTANGULO\n");// se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
		}
		if ((AA == BB) && (AA == CC)) {
			System.out.print("TRIANGULO EQUILATERO\n");// se os três lados forem iguais, apresente a mensagem: TRIANGULO
														// EQUILATERO
		}
		if (((AA == BB) && (AA != CC)) || ((AA == CC) && (AA != BB)) || ((BB == CC) && (BB != AA))) {
			System.out.print("TRIANGULO ISOSCELES\n");// se apenas dois dos lados forem iguais, apresente a mensagem:
														// TRIANGULO ISOSCELES
		}

		sc.close();
	}

}
