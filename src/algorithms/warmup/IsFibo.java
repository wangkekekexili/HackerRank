package algorithms.warmup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class IsFibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(0);
		array.add(1);
		// yes, 49 is a magic number 
		for (int i = 2;i <= 49;i++) {
			array.add(array.get(i-1) + array.get(i-2));
		}
		Set<Integer> s = new HashSet<Integer>(array);
		
		int n = sc.nextInt();
		for (int i = 0;i < n;i++) {
			if (s.contains(sc.nextInt())) {
				System.out.println("IsFibo");
			} else {
				System.out.println("IsNotFibo");
			}
		}
		
		sc.close();
	}

}
