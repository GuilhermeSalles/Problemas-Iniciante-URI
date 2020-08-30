package Iniciante.Ad_Hoc;

import java.util.Scanner;

public class Problem_1963 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double aumento = (B * 100.0 / A) - 100.0;
		System.out.println(String.format("%.2f%%", aumento));

		sc.close();
	}

}