package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-children
 * 
 * @author Ke Wang
 *
 */
public class AngryChildren {

	private static void swap(int[] array, int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
	private static int partition(int[] array, int first, int last) {
		int pivot = array[last];
		int smaller = first-1;
		for (int i = first;i < last;i++) {
			if (pivot >= array[i]) {
				smaller++;
				swap(array, smaller, i);
			}
		}
		smaller++;
		swap(array, smaller, last);
		return smaller;
	}
	
	private static void quicksort(int[] array, int first, int last) {
		if (first >= last) {
			return;
		}
		int p = AngryChildren.partition(array, first, last);
		AngryChildren.quicksort(array, first, p-1);
		AngryChildren.quicksort(array, p+1, last);
	}
	
	public static void quicksort(int[] array) {
		AngryChildren.quicksort(array,0,array.length-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] array = new int[N];
		for (int i = 0;i < N;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		AngryChildren.quicksort(array);
		
		int first = 0;
		int last = K-1;
		int diff = Integer.MAX_VALUE;
		while (last < array.length) {
			int currentDiff = array[last]-array[first];
			if (currentDiff < diff) {
				diff = currentDiff;
			}
			first++;
			last++;
		}
		System.out.println(diff);
		
	}

}
