package com.dcx.Luogu.dp1;

import java.util.Scanner;

//数字金字塔
public class P1216 {
	//数字数组
	static int num[][] = new int[1001][1001];
	//f[i][j]
	static int f[][] = new int[1001][1001];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//输入数据
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				num[i][j] = scanner.nextInt();
			}
		}scanner.close();
		
		//f[i][j]数值初始化
		for(int i = 0; i <= n; i++) {
			for(int j = 1; j <= i+1; j++) {
				f[i][j] = -100;
			}
		}
		f[1][1] = num[1][1];
		//进行动态规划
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				f[i][j] = Math.max(f[i-1][j-1] + num[i][j], f[i-1][j] + num[i][j]);
			}
		}
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res = Math.max(res, f[n][i]);
		}
		System.out.println(res);
	}
}
