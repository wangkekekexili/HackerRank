package algorithms.algebra;

import java.util.Scanner;

public class TriangleNumbers {

	public static void main(String[] args) {
		int numberOfTestCases = 0;
		Scanner sc = new Scanner(System.in);
		numberOfTestCases = sc.nextInt();
		
		for (int i = 0;i < numberOfTestCases;i++) {
			int level = sc.nextInt();
			level--;
			if (level % 2 == 0) {
				System.out.println(2);
			} else if ((level+1) % 4 == 0) {
				System.out.println(3);
			} else {
				System.out.println(4);
			}
		}
		
		sc.close();
	}

}
