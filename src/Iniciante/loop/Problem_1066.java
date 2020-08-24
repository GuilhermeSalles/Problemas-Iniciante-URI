package Iniciante.loop;

import java.util.Scanner;

public class Problem_1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num;
		int par = 0, pos = 0, neg = 0, impar = 0;
		for (int i = 1; i <= 5; i++) {
			num = sc.nextDouble();
			if (num % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
			if(num >=1) {
				pos += 1;
			} else if(num < 0){
				neg += 1;
			}
		}
		
		System.out.printf("%d valor(es) par(es)%n",par);
		System.out.printf("%d valor(es) impar(es)%n",impar);
		System.out.printf("%d valor(es) positivo(s)%n",pos);
		System.out.printf("%d valor(es) negativo(s)%n",neg);

		sc.close();
	}

}
