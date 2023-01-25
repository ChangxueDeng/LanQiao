package com.dcx.Luogu.xunhuanjiegou;

import java.util.Scanner;

public class P5722 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

/*
数列求和，不能使用数列求和公式
*/