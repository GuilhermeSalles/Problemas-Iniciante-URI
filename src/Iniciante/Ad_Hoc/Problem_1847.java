package Iniciante.Ad_Hoc;

import java.util.Scanner;

public class Problem_1847 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (B < A && C >= B)
			System.out.println(":)");
		else if (B > A && C <= B)
			System.out.println(":(");
		else if (B > A && C > B && (C - B) < (B - A))
			System.out.println(":(");
		else if (B > A && C > B && (C - B) >= (B - A))
			System.out.println(":)");
		else if (B < A && C < B && (B - C) < (A - B))
			System.out.println(":)");
		else if (B < A && C < B && (B - C) >= (A - B))
			System.out.println(":(");
		else if (B == A && C > B)
			System.out.println(":)");
		else if (B == A && C < B)
			System.out.println(":(");
		else
			System.out.println(":(");
		sc.close();
	}
}
