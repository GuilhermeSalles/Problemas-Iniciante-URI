package Iniciante;

import java.util.Scanner;

public class Program_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int maior, segundoMaior, menor1, menor2;

		if (A > B && A > C && A > D) {
			maior = A;
			if (B > C && B > D) {
				segundoMaior = B;
				menor1 = C;
				menor2 = D;
			} else if (C > D) {
				segundoMaior = C;
				menor1 = B;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = B;
				menor2 = C;
			}
		} else if (B > C && B > D) {
			maior = B;
			if (A > C && A > D) {
				segundoMaior = A;
				menor1 = C;
				menor2 = D;
			} else if (C > D) {
				segundoMaior = C;
				menor1 = A;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = C;
				menor2 = A;
			}
		} else if (C > D) {
			maior = C;
			if (A > B && A > D) {
				segundoMaior = A;
				menor1 = B;
				menor2 = D;
			} else if (B > D) {
				segundoMaior = B;
				menor1 = A;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = A;
				menor2 = B;
			}
		} else {
			maior = D;
			if (A > B && A > C) {
				segundoMaior = A;
				menor1 = B;
				menor2 = C;
			} else if (B > C) {
				segundoMaior = B;
				menor1 = A;
				menor2 = C;
			} else {
				segundoMaior = C;
				menor1 = A;
				menor2 = B;
			}
		}

		if ((menor1 + menor2 > maior) || (menor1 + menor2 > segundoMaior) || (menor1 + segundoMaior > maior)
				|| (menor1 + segundoMaior > maior) || (menor2 + segundoMaior > maior)
				|| (menor2 + segundoMaior > maior))
			System.out.println("S");
		else
			System.out.println("N");
		sc.close();
	}
}
