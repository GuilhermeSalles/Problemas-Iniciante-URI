package Iniciante;

import java.util.Scanner;

public class Program_1930 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T1 = sc.nextInt();
		int T2 = sc.nextInt();
		int T3 = sc.nextInt();
		int T4 = sc.nextInt();
		int totalTomadas = (T1 + T2 + T3 + T4) - 3;
		System.out.println(totalTomadas);
		sc.close();
	}
}
