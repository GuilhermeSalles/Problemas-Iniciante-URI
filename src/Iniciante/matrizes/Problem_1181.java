package Iniciante.matrizes;
/*Neste problema você deve ler um número, indicando uma linha da matriz na qual uma operação deve ser
 * realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de
 * uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área
 * verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 2 para a linha
 * da matriz, demonstrando os elementos que deverão ser considerados na operação.*/

/*   Entrada
 * A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para
 * operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a
 * operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores
 * de ponto flutuante que compõem a matriz, sendo que a mesma é preenchida linha por linha, da linha 0
 * até a linha 11, sempre da esquerda para a direita.
 */
import java.util.Scanner;

public class Problem_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		char t = sc.next().charAt(0);

		double m[][] = new double[12][12];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextDouble();
			}
		}

		switch (t) {

		case 'S':
			double soma = 0;
			for (int i = 0; i < m[0].length; i++) {
				soma += m[l][i];
			}
			System.out.printf("%.1f\n", soma);
			break;
		case 'M':
			double media = 0;
			for (int i = 0; i < m[0].length; i++) {
				media += m[l][i];
			}
			media /= m[0].length;
			System.out.printf("%.1f\n", media);
			break;
		}
		sc.close();
	}

}
