package Iniciante.selecao;

import java.util.Scanner;

public class Problem_1983 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int matricula, mT = 0;
		double nota, mN = 0;
		for (int i = 0; i < N; i++) {
			matricula = sc.nextInt();
			nota = sc.nextDouble();
			if (nota > mN && nota >= 8) {
				mN = nota;
				mT = matricula;
			}
		}
		if (mN == 0)
			System.out.println("Minimum note not reached");
		else
			System.out.println(mT);
		sc.close();
	}

}
