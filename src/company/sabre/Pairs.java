package company.sabre;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/companies/sabre/challenges/pairs
 * 
 * @author kewang
 *
 */
public class Pairs {
	public static void main(String[] args) {
		
		int numberOfPairs = 0;
		
		Scanner scanner = new Scanner(System.in);
		int n  = scanner.nextInt(); // number of integers
		int distance = scanner.nextInt();
		Set<Long> set = new HashSet<>();
		
		for (int index = 0;index != n;index++) {
			Long nextNumber = scanner.nextLong();
			if (set.contains(nextNumber + distance)) {
				numberOfPairs++;
			}
			if (set.contains(nextNumber - distance)) {
				numberOfPairs++;
			}
			set.add(nextNumber);
		}
		
		System.out.println(numberOfPairs);
		
		scanner.close();
	}
}
