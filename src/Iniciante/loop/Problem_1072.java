package Iniciante.loop;

import java.util.Scanner;

public class Problem_1072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
        if (num > 0) {
            while (count < 6) {
                if (num % 2 != 0) {
                    count++;
                    System.out.println(num);
                }
                num++;
            }
        }

		sc.close();
	}

}
