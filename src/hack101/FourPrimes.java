package hack101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/contests/101hack30/challenges/four-primes
 * 
 * @author kewang
 *
 */
public class FourPrimes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		List<Integer> candidates = new ArrayList<>();
		int max = 0;
		for (int index = 0; index != numbers; index++) {
			int next = sc.nextInt();
			if (next > max) {
				max = next;
			}
			candidates.add(next);
		}
		sc.close();
		
		// get all primes smaller than 'max'
		List<Integer> primes = new ArrayList<>();
		boolean[] notPrime = new boolean[max+1];
		for (int current = 2; current <= max; current++) {
			if (notPrime[current] == false) {
				primes.add(current);
				for (int index = current; index <= max; index+= current) {
					notPrime[index] = true;
				}
			}
		}
		
		Set<Integer> bitOrs = new HashSet<>();
		bitOrs.addAll(primes);
		
		// bitwise or two primes
		for (int prime1Index = 0; prime1Index < primes.size()-1; prime1Index++) {
			for (int prime2Index = prime1Index+1; prime2Index < primes.size(); prime2Index++) {
				int prime1 = primes.get(prime1Index);
				int prime2 = primes.get(prime2Index);
				bitOrs.add(prime1 | prime2);
			}
		}
		
		// bitwise or three primes
		for (int prime1Index = 0; prime1Index < primes.size()-2; prime1Index++) {
			for (int prime2Index = prime1Index+1; prime2Index < primes.size()-1; prime2Index++) {
				for (int prime3Index = prime2Index+1; prime3Index < primes.size(); prime3Index++) {
					int prime1 = primes.get(prime1Index);
					int prime2 = primes.get(prime2Index);
					int prime3 = primes.get(prime3Index);
					bitOrs.add(prime1 | prime2 | prime3);
				}
			}
		}
		
		// bitwise or four primes
		for (int prime1Index = 0; prime1Index < primes.size()-3; prime1Index++) {
			for (int prime2Index = prime1Index+1; prime2Index < primes.size()-2; prime2Index++) {
				for (int prime3Index = prime2Index+1; prime3Index < primes.size()-1; prime3Index++) {
					for (int prime4Index = prime3Index+1; prime4Index < primes.size(); prime4Index++) {
						int prime1 = primes.get(prime1Index);
						int prime2 = primes.get(prime2Index);
						int prime3 = primes.get(prime3Index);
						int prime4 = primes.get(prime4Index);
						bitOrs.add(prime1 | prime2 | prime3 | prime4);
					}
				}
			}
		}		
		for (int candidate : candidates) {
			if (bitOrs.contains(candidate)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}
}
