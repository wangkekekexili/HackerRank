package hack101;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		int numberOfTests  = 0;
		Scanner sc = new Scanner(System.in);
		numberOfTests = sc.nextInt();
		
		for (int i = 0;i < numberOfTests;i++) {
			int temp =  (int)sc.nextLong();
			temp = ~temp;
			System.out.println(Integer.toUnsignedLong(temp));
		}
		
		sc.close();
		
	}

}
