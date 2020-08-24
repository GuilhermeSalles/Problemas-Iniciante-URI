package Iniciante.selecao;

import java.util.Scanner;

public class Problem_1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min1, min2, min3;
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		
		min1 = Math.min(X, Math.min(Y, Z));
		
		if(min1 == X) {
			min2 = Math.min(Y, Z);
			min3 = Math.max(Y, Z);
		} else if (min1 == Y) {
			min2 = Math.min(X, Z);
			min3 = Math.max(X, Z);
		} else {
			min2 = Math.min(Y, X);
			min3 = Math.max(Y, X);
		}
		
		System.out.print(min1 + "\n" + min2 + "\n" + min3 +"\n\n");
		System.out.print(X + "\n" + Y + "\n" + Z);
		
		sc.close();
	}

}
