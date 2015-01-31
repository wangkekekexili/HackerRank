package hack101;

import java.util.Scanner;

public class MaximiseSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfTests = sc.nextInt();
		
		for (int i = 0;i < numberOfTests;i++) {
			int N = sc.nextInt();
			long M = sc.nextLong();
			long[] array = new long[N];
			for (int j = 0;j < N;j++) {
				long current = sc.nextLong();
				array[j] = current % M;
			}
			long max = 0;
			for (int j = 0;j < N;j++) {
				for (int step = 0;step < N-j;step++) {
					int k = step+j;
					long sum = 0;
					for (int l = j;l <= k;l++) {
						sum += array[l];
						sum = sum % M;
						if (sum > max) {
							max = sum;
						}
					}
				}
			}
			System.out.println(max);
		}
		
		sc.close();
	}

}
