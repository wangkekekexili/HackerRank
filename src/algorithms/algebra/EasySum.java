package algorithms.algebra;

import java.util.Scanner;

public class EasySum {

	public static void main(String[] args) {
		int numberOfTestCases = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			numberOfTestCases = sc.nextInt();
		}
		for (int i = 0;i < numberOfTestCases;i++) {
			long N = sc.nextLong();
			long m = sc.nextLong();
			long sumOfOneToM = m*(m-1)/2;
			long times = N / m;
			long remainer = N % m;
			
			long sum = times * sumOfOneToM + remainer*(remainer+1)/2;
			System.out.println(sum);
		}
		sc.close();
	}

}
