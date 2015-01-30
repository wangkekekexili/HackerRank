package algorithms.dynamicprogramming;

import java.util.Scanner;

public class MaximumSubarray {

	public static void main(String[] args) {
		int numberOfTestCases = 0;
		Scanner sc = new Scanner(System.in);
		numberOfTestCases = sc.nextInt();
		
		for (int i = 0;i < numberOfTestCases;i++) {
			int n = sc.nextInt();
			int maxNumber = -10001;
			int max = 0;
			int sumOfPositive = 0;
			int current = 0;
			for (int j = 0;j < n;j++) {
				int temp = sc.nextInt();
				
				if (temp > maxNumber) {
					maxNumber = temp;
				}
				
				if (temp > 0) {
					sumOfPositive += temp;
				}
				
				current += temp;
				if (current < 0) {
					current = 0;
				}
				if (current > max) {
					max = current;
				}
			}
			if (maxNumber < 0) {
				System.out.println(maxNumber+" "+maxNumber);
			} else {
				System.out.println(max+" "+sumOfPositive);
			}
		}
		
		sc.close();
	}

}
