package codesprint;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class GameOfThrones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : input.toCharArray()) {
			Integer i = map.get(ch);
			if (i == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, i.intValue()+1);
			}
		}
		
		boolean flag = true;
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			int value = entry.getValue().intValue();
			if (value%2 == 1) {
				if (flag == true) {
					flag = false;
				} else {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
		
		sc.close();
	}

}
