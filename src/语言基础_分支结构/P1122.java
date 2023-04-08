package 语言基础_分支结构;

import java.util.Scanner;

public class P1122 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int e = s.nextInt();
		s.close();
		double m = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;
		if(0 <= e && e <= 150) {
			e1 = e;
			m = e1 * 0.4463;
		}else if (e >= 151 && e <= 400) {
			e1 = 150;
			e2 = e - e1;
			m = e1 * 0.4463 + e2 * 0.4663;
			
		}else {
			e1 = 150;
			e2 = 250;
			e3 = e - 400;
			m = e1 *0.4463 + e2 * 0.4663 + e3 * 0.5663;
		}
		System.out.format("%.1f", m);
		System.out.println();
	
	}
}
