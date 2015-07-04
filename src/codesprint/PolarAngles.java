package codesprint;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class PolarAngles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Point> list = new ArrayList<Point>();
		
		int n = sc.nextInt();
		for (int i = 0;i != n;i++) {
			list.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(list, (e1, e2)->{
			double angle1 = Math.acos(e1.x/Math.sqrt(e1.x*e1.x+e1.y*e1.y));
			if (e1.y < 0) {
				angle1 = 2*Math.PI - angle1;
			}
			
			double angle2 = Math.acos(e2.x/Math.sqrt(e2.x*e2.x+e2.y*e2.y));
			if (e2.y < 0) {
				angle2 = 2*Math.PI - angle2;
			}
			
			if (angle1 > angle2) {
				return 1;
			} else if (angle1 < angle2) {
				return -1;
			} else {
				double length1 = Math.sqrt(Math.pow(e1.x,2)+Math.pow(e1.y,2));
				double length2 = Math.sqrt(Math.pow(e2.x,2)+Math.pow(e2.y,2));
				if (length1 > length2) {
					return 1;
				} else if (length1 < length2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		for (Point p : list) {
			System.out.println(p.x+" "+p.y);
		}
		
		sc.close();
	}

}
