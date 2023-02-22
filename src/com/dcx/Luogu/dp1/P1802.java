package com.dcx.Luogu.dp1;

import java.util.Scanner;

public class P1802 {
	public static void main(String[] args) {
		long use[] = new long[1001];
		long win[] = new long[1001];
		long lose[] = new long[1001];
		long f[][] = new long[1001][1001];
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			lose[i] = scanner.nextLong();
			win[i] = scanner.nextLong();
			use[i] = scanner.nextLong();
		}scanner.close();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= x; j++) {
				if(j >= use[i])f[i][j] = Math.max(f[i-1][(int)(j - use[i])] + win[i], f[i-1][j] + lose[i]);
				else f[i][j] = f[i-1][j] + lose[i];
			}
		}
		System.out.println(f[n][x] * 5);
	}
}
