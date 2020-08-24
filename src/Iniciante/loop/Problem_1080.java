package Iniciante.loop;

import java.util.Scanner;

public class Problem_1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int maior = 0, posicao = 0;
        for (int i = 1; i <= 100; i++) {
            int num = sc.nextInt();
            if (maior < num) {
            	posicao = i;
                maior = num;
            }
        }
        System.out.print(maior + "\n" + posicao + "\n");
		sc.close();
	}

}
