package com.dcx.Luogu.dituiyudigui;

import java.util.Scanner;

public class P1464 {
	static long input[][] = new long [4][1000];
	//记忆化，存入数组，避免重复计算；
	static long m[][][] = new long[30][30][30];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		while(true) {
			String str = scanner.nextLine();
			if(str.equals("-1 -1 -1")) {
				break;
			}else {
				for(int i = 0; i < 3; i++) {
					String t[] = str.split(" ");
					input[i][n] = Long.parseLong(String.valueOf(t[i]));
				}
				n++;
			}
		}scanner.close();
		for(int i = 0; i < n; i++) {
			input[3][i] = w(input[0][i], input[1][i], input[2][i]);
		}
		for(int i = 0; i < n; i++) {
			System.out.println("w(" + input[0][i] + ", " + input[1][i] +  ", " + input[2][i] + ") = " + input[3][i]);
		}
	}
	static long w(long a, long b, long c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}else if(a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}
		if(m[(int)a][(int)b][(int)c] == 0) {
			if (a < b && b < c) {
				m[(int)a][(int)b][(int)c] =  w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
			}else {
				m[(int)a][(int)b][(int)c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
			}
		}
		return m[(int)a][(int)b][(int)c];
	}
}
