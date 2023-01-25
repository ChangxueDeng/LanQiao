package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P1035 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double k = s.nextInt();
		s.close();
		double sum = 0;
		double i = 1;
		while(sum <= k) {
			sum += (double)1/i++;
		}
		System.out.println((int)i-1);
	}
}
