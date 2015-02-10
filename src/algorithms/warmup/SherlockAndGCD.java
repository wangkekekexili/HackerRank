package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-gcd
 * 
 * @author Ke Wang
 *
 */
public class SherlockAndGCD {
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0;i < cases;i++) {
			int n = sc.nextInt();
			int currentGCD = sc.nextInt();
			for (int j = 1;j < n;j++) {
				int temp = sc.nextInt();
				currentGCD = SherlockAndGCD.gcd(currentGCD, temp);
			}
			if (currentGCD == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
