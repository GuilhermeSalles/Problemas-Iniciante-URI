package Iniciante.loop;

import java.util.Scanner;

public class Problem_1113 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X, Y;
		boolean aux = true;
		while (aux) {
			X = sc.nextInt();
			Y = sc.nextInt();
			
			if (X < Y) {
				System.out.println("Crescente");
				aux = true;
			} else if (X > Y){
				System.out.println("Decrescente");
				aux = true;
			} else {
				aux = false;
			}
		}
		
		sc.close();
	}

}
