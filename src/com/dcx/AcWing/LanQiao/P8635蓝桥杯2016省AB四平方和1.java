package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

//暴力写法
public class P8635蓝桥杯2016省AB四平方和1 {
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
