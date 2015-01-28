package algorithms.strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null;
		if (sc.hasNextLine()) {
			input = sc.nextLine();
		}
		sc.close();
		
		boolean[] checkCharacter = new boolean[26];
		for (char ch : input.toLowerCase().toCharArray()) {
			if (Character.isLetter(ch)) {
				checkCharacter[ch-'a'] = true;
			}
		}
		
		for (int i = 0;i < 26;i++) {
			if (checkCharacter[i] == false) {
				System.out.println("not pangram");
				return;
			}
		}
		
		System.out.println("pangram");
	}

}
