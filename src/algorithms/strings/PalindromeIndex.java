package algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {

	public boolean isPalindrome(char[] array, int first, int last) {
		while (first < last) {
			if (array[first] == array[last]) {
				first++;
				last--;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = 0;
		if (sc.hasNextInt()) {
			numberOfTestCases = sc.nextInt();
		}
		sc.nextLine();
		for (int i = 0;i < numberOfTestCases;i++) {
			String s = sc.nextLine();
			char[] line = s.toCharArray();
			int first = 0;
			int last = line.length-1;
			boolean found = false;
			while (!found && first < last) {
				if (line[first] == line[last]) {
					first++;
					last--;
				} else {
					if (new PalindromeIndex().isPalindrome(line, first+1, last)) {
						System.out.println(first);
					} else {
						System.out.println(last);
					}
					found = true;
					continue;
				}
			}
			if (found == false) {
				System.out.println(-1);
			}
		}
		sc.close();
	}

}
