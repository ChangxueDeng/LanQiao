package com.dcx.AcWing.LanQiao;

import java.util.Scanner;

/*
递归实现指数型枚举
https://www.acwing.com/problem/content/description/94/

 */
public class acwing92 {
	static int n;
	static int num[];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		num = new int[n+1];//状态：0 1 2
		dfs(1);
		scanner.close();
	}
	static public void dfs(int u) {
		if(u > n) {
			for(int i = 1; i <= n; i++) {
				if(num[i] == 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			return;
		}
		num[u] = 2;//第一个分支：不选
		dfs(u+1);
		num[u] = 0;//恢复现场
		
		num[u] = 1;//第二个分支：选
		dfs(u+1);
		num[u] = 0;//恢复现场		
	}
}
