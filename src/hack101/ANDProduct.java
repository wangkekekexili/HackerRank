package hack101;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/101hack20/challenges/and-product
 * 
 * @author Ke Wang
 *
 */
public class ANDProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0;i < n;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			boolean[][] bit = new boolean[end-start+1][32];
			for (int j = start;j <= end;j++) {
				int temp = j;
				for (int k = 1;k <= 32;k++) {
					int flag = temp & 1;
					if (flag == 1) {
						bit[j-start][k-1] = true;
					} else {
						bit[j-start][k-1] = false;
					}
					temp = temp >>> 1;
				}
			}
			int result = 0;
			for (int j = 31;j >= 0;j--) {
				result = result << 1;
				boolean flag = true;
				for (int k = start;k <= end;k++) {
					if (bit[k-start][j] == false) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					result += 1;
				}
			}
			System.out.println(result);
		}
		
		sc.close();
	}

}
