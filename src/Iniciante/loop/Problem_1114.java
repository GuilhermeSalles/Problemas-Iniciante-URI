package Iniciante.loop;

import java.util.Scanner;

public class Problem_1114 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		int senha;
		while((senha = sc.nextInt()) != 2002) {
			System.out.println("Senha Invalida");
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
