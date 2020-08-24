package Iniciante.selecao;

import java.util.Scanner;

public class Problem_1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora_start = sc.nextInt();
		int minu_start = sc.nextInt();
		int all_minu_start = hora_start * 60 + minu_start;

		int hora_end = sc.nextInt();
		int minu_end = sc.nextInt();
		int all_minu_end = hora_end * 60 + minu_end;

		int all_minu_dif = (24 * 60 - all_minu_start) + all_minu_end;

		int horas = all_minu_dif / 60;
		int minutos = all_minu_dif % 60;

		if (horas >= 24 && minutos >= 1) {
			horas = horas % 24;
		}

		System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);

		sc.close();
	}

}
