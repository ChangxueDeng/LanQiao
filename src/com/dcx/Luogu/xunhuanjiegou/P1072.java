package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P1072 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		s.close();
		long a= 2;
		for(;a < n; a++) {
			if(n % a == 0) {
				System.out.println(n/a);
				break;
			}
		}
	}
}
