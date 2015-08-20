package hack101;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/101hack28/challenges/binary-string
 * 
 * @author kewang
 *
 */
public class BinaryString {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int k = scanner.nextInt();
		int t = scanner.nextInt();
		scanner.nextLine();
		String s = scanner.next();
		scanner.close();
		
		char[] chs = s.toCharArray();
		char[] old = null;
		
		
		while (t > 0) {
			if (old != null && isSame(chs, old) == true) {
				break;
			} else {
				old = copy(chs);
			}
			int start = 0;
			while (true) {
				if (start >= size) {
					break;
				}

			    for (int index = start;index < start + k;index++) {
			    	if (index + k >= size) {
			    		break;
			    	}
			    	if (chs[index] == '0' && chs[index+k] == '1') {
			    		chs[index] = '1';
			    		chs[index+k] = '0';
			    		t--;
			    	}
			    }
			    start += k;
			}
		}

		for (char ch : chs) {
			System.out.print(ch);
		}
		
	}

	private static char[] copy(char[] chs) {
		char[] old = new char[chs.length];
		for (int i = 0;i != chs.length;i++) {
			old[i] = chs[i];
		}
		return old;
	}

	private static boolean isSame(char[] chs, char[] old) {
		for (int i = 0;i != chs.length;i++) {
			if (chs[i] != old[i]) {
				return false;
			}
		}
		return true;
	}
}
