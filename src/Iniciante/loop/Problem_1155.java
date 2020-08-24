package Iniciante.loop;

public class Problem_1155 {

	public static void main(String[] args) {
		double S = 0;
		for(int i = 1; i <= 100; i++) {
			S += (1 / i);
		}
		System.out.printf("%.2f%n",S);
	}
}
