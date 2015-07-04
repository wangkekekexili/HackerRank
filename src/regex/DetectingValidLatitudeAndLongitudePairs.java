package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DetectingValidLatitudeAndLongitudePairs {

	public static boolean isValidPair(String s) {
		if (Pattern.matches("^\\([+-]?[1-9]\\p{Digit}*(.[0-9]\\p{Digit}*)?, [+-]?[1-9]\\p{Digit}*(.[0-9]\\p{Digit}*)?\\)$",s) == false) {
			return false;
		}
		// get x and y from s
		double x, y;
		
		int beginIndex = 1;
		int endIndex = 2;
		while (s.charAt(endIndex) != ',') {
			endIndex++;
		}
		try {
			x = Double.parseDouble(s.substring(beginIndex, endIndex));
		} catch (NumberFormatException e) {
			return false;
		}
		if (x<-90 || x>90) {
			return false;
		}
		beginIndex = endIndex+2;
		endIndex = beginIndex+1;
		while (s.charAt(endIndex) != ')') {
			endIndex++;
		}
		try {
			y = Double.parseDouble(s.substring(beginIndex, endIndex));
		} catch (NumberFormatException e) {
			return false;
		}
		if (y<-180 || y>180) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0;i < n;i++) {
			if (DetectingValidLatitudeAndLongitudePairs.isValidPair(sc.nextLine())) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}

}
