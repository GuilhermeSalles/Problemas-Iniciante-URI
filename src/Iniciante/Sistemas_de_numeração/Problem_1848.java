package Iniciante.Sistemas_de_numeração;

import java.util.Scanner;

public class Problem_1848 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, flag;
		String corvo;
		for (int i = 0; i < 3; i++) {
			numero = 0;
			flag = 0;
			while (flag == 0) {
				corvo = sc.nextLine();
				switch (corvo) {
				case "--*":
					numero += 1;
					break;
				case "-*-":
					numero += 2;
					break;
				case "-**":
					numero += 3;
					break;
				case "*--":
					numero += 4;
					break;
				case "*-*":
					numero += 5;
					break;
				case "**-":
					numero += 6;
					break;
				case "***":
					numero += 7;
					break;
				default:
					flag = 1;
					break;
				}
			}
			System.out.println(numero);
		}
		sc.close();
	}

}
