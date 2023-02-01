package com.dcx.Luogu.dituiyudigui;

import java.util.Scanner;

public class P1044 {
	static int P[][];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		P = new int[n+1][n+1];
		for(int i = 0; i <= n; i++) {
			P[0][i] = 1;
		}
		for(int i = 1; i <= n;i++) {
			for(int j = i; j <= n; j++) {
				if(i != 0) P[i][j] += P[i-1][j];
				if(j != 0) P[i][j] += P[i][j-1];
			}
		}
		System.out.println(P[n][n]);
	}
}