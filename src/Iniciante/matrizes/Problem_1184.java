package Iniciante.matrizes;

import java.util.Scanner;

public class Problem_1184 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float soma = 0;    
        float mat[][] = new float[12][12];
        String op;
        op = sc.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextFloat();
                if(j<i)
                    soma+=mat[i][j];
            }
        }
        if(op.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else if(op.equals("M")){
            System.out.printf("%.1f\n", soma/66);
        }
		sc.close();
	}

}