package algorithms.implementation;

import java.util.Scanner;

public class CavityMap {

	public static boolean isCavity(int[][] matrix,int i, int j) {
		if (matrix[i][j] > matrix[i-1][j] &&
			matrix[i][j] > matrix[i+1][j] &&
			matrix[i][j] > matrix[i][j-1] &&
			matrix[i][j] > matrix[i][j+1])
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		sc.nextLine();
		int[][] matrix = new int[depth][depth];
		for (int i = 0;i < depth;i++) {
			String line = sc.nextLine();
			for (int j = 0;j < depth;j++) {
				matrix[i][j] = Integer.parseInt(line.substring(j,j+1));
			}
		}
		sc.close();
		
		
		
		boolean[][] flag = new boolean[depth][depth];
		for (int i = 1;i < depth-1;i++) {
			for (int j = 1;j < depth-1;j++) {
				if (CavityMap.isCavity(matrix,i,j)) {
					flag[i][j] = true;
				}
			}
		}
		
		for (int i = 0;i < depth;i++) {
			for (int j = 0;j < depth;j++) {
				if (flag[i][j] == true) {
					System.out.print('X');
				} else {
					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
		
	}

}
