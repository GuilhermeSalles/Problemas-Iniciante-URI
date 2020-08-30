package Iniciante.Ad_Hoc;

import java.util.Scanner;

public class Problem_1960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T, anos;
		for (int i = 0; i < N; i++) {
			T = sc.nextInt();
			if (T >= 2015) {
				anos = T - 2014;
				System.out.println(anos + " A.C.");
			} else {
				anos = 2015 - T;
				System.out.println(anos + " D.C.");
			}
		}
		sc.close();
	}

}