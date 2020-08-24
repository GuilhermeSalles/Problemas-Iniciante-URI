package Iniciante.loop;

import java.util.Scanner;

public class Problem_1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Nota, media = 0, count = 0;

		while (count != 2) {
			Nota = sc.nextFloat();
			if (Nota < 0 || Nota > 10) {
				System.out.println("nota invalida");
			} else {
				media += Nota;
				count += 1;
			}
		}
		float mediaF = media / 2;

		System.out.printf("media = %.2f\n", mediaF);
		sc.close();
	}

}
