package Iniciante.Ad_Hoc;

import java.util.Scanner;

public class Problem_1957 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String hexa = Integer.toHexString(n).toUpperCase();
		System.out.println(hexa);
		sc.close();
	}

}