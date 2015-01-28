package algorithms.strings;

import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		int numberOfTestCases = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			numberOfTestCases = sc.nextInt();
		}
		sc.nextLine();
		int[] charArray = new int[26];
		for (int i = 0;i < numberOfTestCases;i++) {
			boolean[] thisRound = new boolean[26];
			char[] line = sc.nextLine()
					.toLowerCase()
					.toCharArray();
			for (char ch : line) {
				thisRound[ch-'a'] = true;
			}
			for (int j = 0;j < 26;j++) {
				if (thisRound[j] == true) {
					charArray[j]++;
				}
			}
		}
		int count = 0;
		for (int i : charArray) {
			if (i == numberOfTestCases) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
