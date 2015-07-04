package hack101;

import java.util.Scanner;

public class MagicalGirls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0;i != cases;i++) {
			int n = sc.nextInt();
			int[] value = new int[n];
			boolean[] ifNegative = new boolean[n]; 
			
			boolean positive = true;
			
			for (int j = 0;j != n;j++) {
				value[j] = sc.nextInt();
				if (value[j] < 0) {
					positive = false;
					ifNegative[j] = true;
				}
			}
			
			if (positive == true) {
				System.out.println("She did it!");
			}
		
			boolean ifMadeIt = false;
			int maxStep = 1;
			for (int j = 0;j != n;j++) {
				if (ifNegative[j] == false) { continue; }
				value[j] = -value[j];
				int current = 0;
				for (int k = 0;k != n;k++) {
					current += value[k];
					if (current < 0) {
						if (k+1 > maxStep) {
							maxStep = k + 1;
						}
						break;
					}
				}
				if (current >= 0) {
					ifMadeIt = true;
					System.out.println("She did it!");
					value[j] = -value[j];
					break;
				}
				value[j] = -value[j];
			}
			if (ifMadeIt == false) {
				System.out.println(maxStep);
			}
			
		}
		sc.close();
	}

}
