package Iniciante.loop;

import java.util.Scanner;

public class Problem_1115 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X, Y;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
			if(X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X > 0 && Y < 0) {
				System.out.println("quarto");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			}
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		sc.close();
	}

}
