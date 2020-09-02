
package Iniciante.loop;

import java.util.Scanner;

public class Problem_2060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L, m2 = 0, m3 = 0, m4 = 0, m5 = 0;
		for (int i = 0; i < N; i++) {
			L = sc.nextInt();
			if (L % 2 == 0)
				m2++;
			if (L % 3 == 0)
				m3++;
			if (L % 4 == 0)
				m4++;
			if (L % 5 == 0)
				m5++;
		}
		System.out.println(m2 + " Multiplo(s) de 2");
		System.out.println(m3 + " Multiplo(s) de 3");
		System.out.println(m4 + " Multiplo(s) de 4");
		System.out.println(m5 + " Multiplo(s) de 5");
		sc.close();
	}
}
