package algorithms.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String[] args) {
		int numberOfCases = 0;
		Scanner sc = new Scanner(System.in);
		numberOfCases = sc.nextInt();
		
		for (int i = 0;i < numberOfCases;i++) {
			int expectedSum = sc.nextInt();
			int numbers = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int k = 1;k <= numbers;k++) {
				int current = sc.nextInt();
				Integer position = map.get(expectedSum-current);
				if (position==null) {
					map.put(current, k);
				} else {
					System.out.println(position.intValue()+" "+k);
					sc.nextLine();
					break;
				}
			}
		}
		
		sc.close();
	}

}
