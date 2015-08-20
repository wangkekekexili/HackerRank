package company.vmware;

import java.util.Scanner;

public class PalindromeIndex {

	/**
	 * Return if a string is palindrome.
	 * 
	 * @param s the input string
	 * @return true if the input string is palindrome
	 */
	public static final boolean isPalindrome(final String s) {
		if (s == null || s.length() == 0 || s.length() == 1) {
			return true;
		}
		int firstIndex = 0;
		int lastIndex = s.length() - 1;
		while (firstIndex < lastIndex) {
			if (s.charAt(firstIndex) == s.charAt(lastIndex)) {
				firstIndex++;
				lastIndex--;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static final int palindromeIndexOf(final String s) {
		if (isPalindrome(s)) {
			return -1;
		} else {
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTest =  scanner.nextInt();
		for (int i = 0;i != numberOfTest;i++) {
			System.out.println(palindromeIndexOf(scanner.next()));
		}
		scanner.close();
	}

}
