package Iniciante.Ad_Hoc;

import java.util.Scanner;

public class Problem_1958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
		sc.close();
	}

}