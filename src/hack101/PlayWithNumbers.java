package hack101;


import java.util.Scanner;

public class PlayWithNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[4001];
		long[] number = new long[4001];
		for (int i = 0;i < 4001;i++) {
			number[i] = i-2000;
		}
		for (int i = 0;i < N;i++) {
			array[sc.nextInt()+2000]++;
		}
		int Q = sc.nextInt();
		for (int i = 0;i < Q;i++) {
			long sum = 0;
			long add = sc.nextLong();

			for (int j = 0;j < 4001;j++) {
				number[j] += add;
				sum += (long)array[j] * Math.abs(number[j]);
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}
