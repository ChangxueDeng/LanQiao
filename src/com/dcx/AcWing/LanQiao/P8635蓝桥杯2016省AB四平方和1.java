package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

//����д��
public class P8635���ű�2016ʡAB��ƽ����1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		for(int a = 0 ; a * a <= n; a++) {
			for(int b = a; b * b + a * a <= n; b++) {
				for(int c = b; c * c + a * a + b * b <= n; c++) {
					int t = n - c * c - a * a - b * b;
					int d = (int)Math.sqrt(t);
					if(d * d == t) {
						System.out.println(a + " " + b + " " + c + " " + d);
						System.exit(0);
					}
				}
			}
		}
	}
}
