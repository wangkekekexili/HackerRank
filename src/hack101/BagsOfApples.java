package hack101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This program has some major issues though it passes all test cases.
 * 
 * @author kewang
 *
 */
public class BagsOfApples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0;i != n;i++) {
			numbers.add(scanner.nextInt());
		}
		scanner.close();
		Collections.sort(numbers);
		int total = numbers.stream().mapToInt(e->e.intValue()).sum();
		for (int i = 0;i != n;i++) {
			if (total % 3 == 0) {
				System.out.println(total);
				return;
			} else {
				if (numbers.get(i) % 3 != 0) {
					total -= numbers.get(i);
				}
			}
		}
		System.out.println(0);
	}
}
