package Iniciante.arrays;

import java.util.Scanner;

public class Problem_1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menor = 1000, pos = 0;
		
		int n  =sc.nextInt();
		int[] vet = new int[n];

		for(int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
			
			if(vet[i] < menor) {
				menor = vet[i];
				pos = i;
			}
		}
		System.out.printf("Menor valor: %d\nPosicao: %d\n", menor, pos );
		sc.close();
	}
}
