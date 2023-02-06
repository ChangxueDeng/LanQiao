package com.dcx.Luogu.dp1;

import java.util.Scanner;

//01背包问题
public class P1048 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//总时间
		int T = scanner.nextInt();
		//总数量
		int M = scanner.nextInt();
		//状态集合
		long f[][] = new long [110][1010]; 
		int Ti[] = new int[1010];
		int Wi[] = new int[110];
		//读取数据
		for(int i = 1; i <= M;i++) {
			Ti[i] = scanner.nextInt();
			Wi[i] = scanner.nextInt();
		}scanner.close();
		for(int i = 1; i <= M; i++) {
			for(int j = 1; j <= T; j++) {
				if(j < Ti[i]) f[i][j] = f[i-1][j];
				else {
					f[i][j] = Math.max(f[i-1][j],f[i-1][j - Ti[i]] + Wi[i]);
				}
			}
		}
		System.out.println(f[M][T]);
	}
}
