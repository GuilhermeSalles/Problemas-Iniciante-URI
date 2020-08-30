package Iniciante;

import java.util.Scanner;

public class Program_1858 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T, menor = 0, posMenor = 0;
		for (int i = 1; i <= N; i++) {
			T = sc.nextInt();
			if (i == 1) {
				posMenor = 1;
				menor = T;
			} else if (T < menor) {
				posMenor = i;
				menor = T;
			}
		}
		System.out.println(posMenor);
		sc.close();
	}

}
