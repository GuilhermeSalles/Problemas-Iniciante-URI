package Iniciante.Ad_Hoc;


import java.io.IOException;
import java.util.Scanner;

public class Problem_1865 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		String nome;
		int N;
		for (int i = 0; i < C; i++) {
			nome = sc.next();
			N = sc.nextInt();
			if (nome.equalsIgnoreCase("thor")) System.out.println("Y");
			else System.out.println("N");
		}
		sc.close();
	}

}