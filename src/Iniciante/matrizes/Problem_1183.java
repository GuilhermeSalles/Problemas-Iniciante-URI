package Iniciante.matrizes;
/* Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
 * Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão 
 * acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).*/


/*   Entrada
 * A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação
 *(Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto
 *flutuante que compõem a matriz.
 */
import java.util.Scanner;
import java.util.Locale;

public class Problem_1183 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int MEDIA=0, l, c;
		char O = sc.next().charAt(0);
		double SOMA=0.0;
		double[][] n = new double[12][12];

		for(l=0; l<12; l++)
			for(c=0; c<12; c++)
				n[l][c] = sc.nextDouble();

		//MATRIZ[LINHA][COLUNA]

		for(l=0; l<12; l++)
			for(c=0; c<12; c++){
				if (c > l){
					SOMA += n[l][c];
					if (n[l][c] != 0)
						MEDIA++;
				}
			}

		if (O == 'S')
			System.out.printf("%.1f\n",SOMA);
		if (O == 'M')
			System.out.printf("%.1f\n",SOMA/MEDIA);

		sc.close();
	}

}
