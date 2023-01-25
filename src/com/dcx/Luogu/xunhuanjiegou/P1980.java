package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P1980 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String  x = s.next();
		s.close();
		int t = 0;
		for(int i = 1; i <= n; i++) {
			String str = String.valueOf(i);
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == x.charAt(0)) {
					t++;
				}
			}
		}
		System.out.println(t);
	}
}