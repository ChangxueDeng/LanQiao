package com.dcx.Luogu.erfenyuqianzhuihe;

import java.util.Scanner;

//二维前缀和
//n的范围是1-120，如果枚举每一个
public class P1719最大加权矩形 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[][] = new int[n+1][n+1];//原矩阵
		int s[][] = new int[n+1][n+1];//前缀和矩阵
		int max_Sum = -1000000;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				a[i][j] = scanner.nextInt();
				s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + a[i][j];
			}
		}scanner.close();
		for(int x1 = 1; x1 <= n; x1++) {
			for(int y1 = 1; y1 <= n; y1++) {
				for(int x2 = x1; x2 <= n; x2++) {
					for(int y2 = y1; y2 <= n; y2++) {
						int t_Sum = s[x2][y2] - s[x2][y2 - y1] - s[x2 - x1][y2] + s[x2 - x1][y2 - y1];
						max_Sum = t_Sum > max_Sum ? t_Sum : max_Sum;
					}
				}
			}
		}
		System.out.println(max_Sum);
	}
	
}
