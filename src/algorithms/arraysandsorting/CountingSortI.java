package algorithms.arraysandsorting;

import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/countingsort1
 * 
 * @author Ke Wang
 *
 */
public class CountingSortI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] count = new int[100];
		for (int i = 0;i < n;i++) {
			int temp = sc.nextInt();
			count[temp]++;
		}
		for (int c : count) {
			System.out.print(c+" ");
		}
	}

}
