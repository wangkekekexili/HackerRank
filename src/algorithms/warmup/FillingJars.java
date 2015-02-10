package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/filling-jars
 * 
 * @author Ke Wang
 *
 */
public class FillingJars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long jars = sc.nextLong();
		int n = sc.nextInt();
		double totalAmount = 0;
		for (int i = 0;i < n;i++) {
			long start = sc.nextLong();
			long end = sc.nextLong();
			long amount = sc.nextLong();
			totalAmount += (end-start+1)*amount;
		}
		System.out.println((long)(totalAmount/jars));
		sc.close();
	}

}
