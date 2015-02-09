package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/manasa-and-stones
 * 
 * @author Ke Wang
 *
 */
public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int i = 0;i < tests;i++) {
			int numbers = sc.nextInt()-1;
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (b<a) {
				int temp = b;
				b = a;
				a = temp;
			}
			int current = a * numbers;
			while (numbers >= 0) {
				System.out.print(current+" ");
				current = current-a+b;
				numbers--;
			}
			System.out.println();
		}
		sc.close();
	}

}
