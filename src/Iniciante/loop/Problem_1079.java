package Iniciante.loop;

import java.util.Scanner;

public class Problem_1079 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float n1, n2, n3, media;
		
		for (int i = 0; i < n; i++) {
			n1 = sc.nextFloat() * 2;
			n2 = sc.nextFloat() * 3;
			n3 = sc.nextFloat() * 5;
			media = (n1 + n2 + n3) / 10;
			System.out.printf("%.1f%n", media);

		}
		sc.close();
	}

}
