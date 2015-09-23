package hack101;

import java.util.Scanner;

public class XaeroAndABinaryGift {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] a = scanner.next().toCharArray();
		char[] b = scanner.next().toCharArray();
		scanner.close();
		if (a.length != b.length) {
			System.out.println(-1);
			System.exit(0);
		}
		int numberOfOnesInA = 0;
		int numberOfOnesInB = 0;
		int diffs = 0;
		for (int index = 0; index != a.length; index++) {
			if (a[index] == '1') {
				numberOfOnesInA++;
			}
			if (b[index] == '1') {
				numberOfOnesInB++;
			}
			if (a[index] != b[index]) {
				diffs++;
			}
		}
		if (numberOfOnesInA != numberOfOnesInB) {
			System.out.println(-1);
		} else {
			System.out.println(diffs / 2);
		}
	}
}
